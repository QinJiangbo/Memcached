package com.qinjiangbo;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;

public class MemcachedFactory {
	
	static {
		// add servers host + port
		String[] servers = {"hadoop.qinjiangbo.com:11211"};
		// set weights
		Integer[] weights = {10};
		// create connection pool 
		SockIOPool pool = SockIOPool.getInstance();
		// initialize pool
		pool.setServers(servers);
		pool.setWeights(weights);
		// set TCP settings
		pool.setNagle(false);
		// TO means "TimeOut"
		pool.setSocketTO(1000);
		pool.setSocketConnectTO(0);
		// initialize the connection pool
		pool.initialize();
	}
	
	private MemcachedFactory() {
		//prohibit instantialization
	}
	
	public static MemCachedClient createClient() {
		return new MemCachedClient();
	}
	
}
