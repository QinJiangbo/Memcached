package com.qinjiangbo;

import java.util.Map;

import com.whalin.MemCached.MemCachedClient;

public class CommandStats {
	
	public static void main(String[] args) {
		MemCachedClient memCachedClient = MemcachedFactory.createClient();
		Map<String, Map<String, String>> stats = memCachedClient.stats();
		System.out.println(stats);
		
		System.out.println("\n\n\n");
		stats = memCachedClient.statsItems();
		System.out.println(stats);
		
		System.out.println("\n\n\n");
		stats = memCachedClient.statsSlabs();
		System.out.println(stats);
	}
	
}
