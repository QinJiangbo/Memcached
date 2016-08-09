package com.qinjiangbo;

import java.util.Date;

import com.whalin.MemCached.MemCachedClient;

public class CommandPrepend {
	
	public static void main(String[] args) {
		
		MemCachedClient memCachedClient = MemcachedFactory.createClient();
		
		memCachedClient.set("name", "qinjiangbo", timeExpire(5));
		System.out.println("before append: name = " + memCachedClient.get("name"));
		memCachedClient.prepend("name", "chengyinglove");
		System.out.println("after preppend: name = " + memCachedClient.get("name"));
	}
	
	private static Date timeExpire(int secs) {
		return new Date(System.currentTimeMillis() + secs * 1000);
	}
}
