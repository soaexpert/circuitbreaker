/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.etcd;

import org.apache.camel.Endpoint;
import org.apache.camel.Processor;
import org.apache.camel.impl.DefaultConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.justinsb.etcd.EtcdClient;

public class EtcdConsumer extends DefaultConsumer {

	private static final Logger LOG = LoggerFactory
			.getLogger(EtcdConsumer.class);

	private EtcdClient etcdClient;

	private EtcdConfiguration configuration;

	private EtcdWatcher watcher;
	

	public EtcdConsumer(Endpoint endpoint, Processor processor,
			EtcdConfiguration configuration, EtcdClient etcdClient) {
		super(endpoint, processor);
		this.configuration = configuration;
		this.etcdClient = etcdClient;
	}

	@Override
	protected void doStart() throws Exception {

		
		watcher = new EtcdWatcher(etcdClient, getEndpoint(), getProcessor(), configuration);
		watcher.init();

	}

	@Override
	protected void doSuspend() throws Exception {
		if (watcher != null) {
			watcher.stop();
		}
	}

	@Override
	protected void doShutdown() throws Exception {
		doSuspend();
	}

	@Override
	protected void doResume() throws Exception {
		doStart();
	}

	@Override
	protected void doStop() throws Exception {
		doSuspend();
	}

}
