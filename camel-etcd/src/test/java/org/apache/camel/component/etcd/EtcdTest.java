package org.apache.camel.component.etcd;

import java.net.URI;
import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.justinsb.etcd.EtcdClient;
import com.justinsb.etcd.EtcdResult;



public class EtcdTest {
	
	
	public static void main(String[] args) throws Exception  {
		
		
		EtcdClient etcdClient = new EtcdClient(new URI("http://127.0.0.1:4001"));
		etcdClient.get("/exchange");
	}

}
