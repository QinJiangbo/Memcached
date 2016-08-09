package com.qinjiangbo;

import java.util.Date;

import com.whalin.MemCached.MemCachedClient;

public class CommandIncrDecr {
	
	public static void main(String[] args) {
		
		MemCachedClient memCachedClient = MemcachedFactory.createClient();
		
		memCachedClient.set("number", "100", timeExpire(5));
		System.out.println("before incr/decr: number = " + memCachedClient.get("number"));
		
		memCachedClient.incr("number", 11);
		System.out.println("after incr: number = " + memCachedClient.get("number"));
		
		memCachedClient.decr("number", 12);
		System.out.println("after decr: number = " + memCachedClient.get("number"));
	}
	
	private static Date timeExpire(int secs) {
		return new Date(System.currentTimeMillis() + secs * 1000);
	}
}
