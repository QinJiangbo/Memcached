package com.qinjiangbo;

import java.util.Date;

import com.whalin.MemCached.MemCachedClient;

public class CommandAppend {

	public static void main(String[] args) {
		
		MemCachedClient memCachedClient = MemcachedFactory.createClient();
		
		memCachedClient.set("name", "qinjiangbo", timeExpire(5));
		System.out.println("before append: name = " + memCachedClient.get("name"));
		memCachedClient.append("name", "lovechengying");
		System.out.println("after append: name = " + memCachedClient.get("name"));
	}
	
	private static Date timeExpire(int secs) {
		return new Date(System.currentTimeMillis() + secs * 1000);
	}

}
