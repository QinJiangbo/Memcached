package com.qinjiangbo;

import java.util.Date;

import com.whalin.MemCached.MemCachedClient;

public class CommandDelete {
	
	public static void main(String[] args) {
		
		MemCachedClient memCachedClient = MemcachedFactory.createClient();
		
		memCachedClient.set("name", "qinjiangbo", timeExpire(5));
		System.out.println("before delete: name = " + memCachedClient.get("name"));
		
		memCachedClient.delete("name");
		System.out.println("after delete: name = " + memCachedClient.get("name"));
	}
	
	private static Date timeExpire(int secs) {
		return new Date(System.currentTimeMillis() + secs * 1000);
	}
}
