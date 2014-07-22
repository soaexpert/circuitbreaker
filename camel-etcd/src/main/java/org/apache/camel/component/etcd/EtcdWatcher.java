package org.apache.camel.component.etcd;

import java.util.List;
import java.util.concurrent.Executors;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.util.concurrent.ListenableFuture;
import com.justinsb.etcd.EtcdClient;
import com.justinsb.etcd.EtcdClientException;
import com.justinsb.etcd.EtcdNode;
import com.justinsb.etcd.EtcdResult;

public class EtcdWatcher implements Runnable {

	private static final Logger LOG = LoggerFactory
			.getLogger(EtcdWatcher.class);

	private boolean enabled = false;
	private EtcdClient etcdClient;
	private Endpoint endpoint;
	private Processor processor;

	private ListenableFuture<EtcdResult> future;
	private EtcdConfiguration configuration;

	public EtcdWatcher(EtcdClient etcdClient, Endpoint endpoint,
			Processor processor, EtcdConfiguration configuration) {
		this.etcdClient = etcdClient;
		this.endpoint = endpoint;
		this.processor = processor;
		this.configuration = configuration;
	}

	@Override
	public void run() {

		while (enabled) {
			try {
				future = etcdClient.watch(configuration.getKey(), null,
						configuration.isRecursiveWatch());

				EtcdResult result = future.get();

				Exchange exchange = endpoint.createExchange();
				exchange.getIn().setBody(result);

				processor.process(exchange);
			} catch (Exception e) {
				LOG.warn("Something went wrong trying to process etcd result.",
						e);
			}

		}

	}

	private void doInitialProcessing() {
		try {

			Exchange exchange = endpoint.createExchange();

			EtcdResult result = etcdClient.listChildren(configuration.getKey());

			if (configuration.isRecursiveWatch()) {

				enrichResult(result.node);

			}

			exchange.getIn().setBody(result);
			processor.process(exchange);

		} catch (Exception e) {
			LOG.warn("Something went wrong trying to process etcd result.", e);
		}
	}

	private void enrichResult(EtcdNode node) throws EtcdClientException {
		if (node != null && node.dir) {

			List<EtcdNode> subNodes = etcdClient.listDirectory(node.key);
			node.nodes = subNodes;
			if (subNodes != null) {
				for (EtcdNode toEnrich : subNodes) {
					enrichResult(toEnrich);
				}
			}

		}

	}

	public void init() {

		if (configuration.isBootstrap()) {
			doInitialProcessing();
		}

		enabled = true;
		Executors.newFixedThreadPool(1).execute(this);
	}

	public void stop() {
		enabled = false;
		if (future != null) {
			future.cancel(true);
		}
	}

}
