package com.qinjiangbo;

import java.util.Date;

import com.whalin.MemCached.MemCachedClient;

public class CommandAdd {
	
	public static void main(String[] args) {
		MemCachedClient memCachedClient = MemcachedFactory.createClient();
		
		memCachedClient.set("name", "qinjiangbo", timeExpire(5));
		
		boolean result = memCachedClient.add("name", "qinjiangbo", timeExpire(5));
		System.out.println("add exist: " + result);
		System.out.println("name value in cache: " + memCachedClient.get("name"));
		
		result = memCachedClient.add("password", "123456", timeExpire(5));
		System.out.println("add nno-exist: " + result);
		System.out.println("password value in cache: " + memCachedClient.get("password"));
		
	}
	
	private static Date timeExpire(int secs) {
		return new Date(System.currentTimeMillis() + secs * 1000);
	}
}
