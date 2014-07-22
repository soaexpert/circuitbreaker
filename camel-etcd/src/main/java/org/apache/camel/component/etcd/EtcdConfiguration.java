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

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.camel.Exchange;
import org.apache.camel.spi.UriParam;

public class EtcdConfiguration {
	
	
	
	/**
	 * Indicates where etcd is
	 */
	private String uri = "http://localhost:4001";
	
	
	/**
	 * Indicates which key of etcd we are interested in. May be modified by the presence of header {@link EtcdConstants#ETCD_KEY_HEADER}.
	 * If present, this header has the privilege over the static configuration.
	 */
	@UriParam
	private String key = "/";
	
	
	
	/**
	 * Indicates which operating mode {@link EtcdProducer} will assume. It uses the values present in {@link EtcdMode}.
	 */
	@UriParam
	private String mode = EtcdMode.SET.name();
	
	
	/**
	 * Indicates whether {@link EtcdWatcher} should watch keys recursively or not.
	 */
	@UriParam
	private boolean recursiveWatch = true;
	
	
	/**
	 * Indicates whether {@link EtcdConsumer} should list keys during bootstrap or not.
	 */
	@UriParam
	private boolean bootstrap = false;
	
	
	
	@UriParam
	private Integer ttl;

	public URI makeURI() throws URISyntaxException {
		return new URI(uri);
	}

	public void setUri(String uri) {
		this.uri = uri;
	}


	public String getKey() {
		return key;
	}
	
	public String getKey(Exchange exchange) {
		return exchange.getIn().getHeader(EtcdConstants.ETCD_KEY_HEADER, key, String.class);
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	
	public boolean isRecursiveWatch() {
		return recursiveWatch;
	}
	
	public void setRecursiveWatch(boolean recursiveWatch) {
		this.recursiveWatch = recursiveWatch;
	}
	
	
	
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public EtcdMode getMode(Exchange exchange) {
		
		
		return EtcdMode.getMode(this.mode);
		
	}
	
	public boolean isBootstrap() {
		return bootstrap;
	}
	
	public void setBootstrap(boolean bootstrap) {
		this.bootstrap = bootstrap;
	}
	
	public Integer getTtl() {
		return ttl;
	}
	
	public void setTtl(Integer ttl) {
		this.ttl = ttl;
	}
}
