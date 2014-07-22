package org.apache.camel.component.etcd;

import org.apache.camel.Exchange;
import org.apache.camel.NoTypeConversionAvailableException;
import org.apache.camel.TypeConversionException;

import com.justinsb.etcd.EtcdClient;
import com.justinsb.etcd.EtcdClientException;
import com.justinsb.etcd.EtcdResult;

public enum EtcdMode {
	
	LIST {
		@Override
		public EtcdResult execute(Exchange exchange, EtcdClient etcdClient,
				EtcdConfiguration configuration) throws EtcdClientException, TypeConversionException, NoTypeConversionAvailableException{
			return etcdClient.listChildren(configuration.getKey(exchange));
		}
	},
	GET {
		@Override
		public EtcdResult execute(Exchange exchange, EtcdClient etcdClient,
				EtcdConfiguration configuration) throws EtcdClientException, TypeConversionException, NoTypeConversionAvailableException{
			return etcdClient.get(configuration.getKey(exchange));
		}
	},
	SET {
		@Override
		public EtcdResult execute(Exchange exchange, EtcdClient etcdClient,
				EtcdConfiguration configuration) throws EtcdClientException, TypeConversionException, NoTypeConversionAvailableException{
			
			String newValue = exchange.getContext().getTypeConverter().mandatoryConvertTo(String.class, exchange.getIn().getBody());
			return etcdClient.set(configuration.getKey(exchange), newValue, configuration.getTtl());
		}
	},
	CAS {
		@Override
		public EtcdResult execute(Exchange exchange, EtcdClient etcdClient,
				EtcdConfiguration configuration) throws EtcdClientException, TypeConversionException, NoTypeConversionAvailableException{
			
			String casValue = exchange.getIn().getHeader(EtcdConstants.ETCD_CAS_VALUE_HEADER, null, String.class);
			String newValue = exchange.getContext().getTypeConverter().mandatoryConvertTo(String.class, exchange.getIn().getBody());
			
			return etcdClient.cas(configuration.getKey(exchange), casValue, newValue);
		}
	},
	DELETE {
		@Override
		public EtcdResult execute(Exchange exchange, EtcdClient etcdClient,
				EtcdConfiguration configuration) throws EtcdClientException, TypeConversionException, NoTypeConversionAvailableException{
			
			return etcdClient.delete(configuration.getKey(exchange));
		}
	};
	
	
	public abstract EtcdResult execute(Exchange exchange, EtcdClient etcdClient, EtcdConfiguration configuration) throws EtcdClientException, TypeConversionException, NoTypeConversionAvailableException;
	
	
	public static EtcdMode getMode(String mode) {
		if (mode == null) {
			return null;
		}
		for (EtcdMode etcdMode : EtcdMode.values()) {
			if (etcdMode.name().toLowerCase().equals(mode.toLowerCase())) {
				return etcdMode;
			}
		}
		return null;
	}

}
