package com.qinjiangbo;

import java.util.Date;

import com.whalin.MemCached.MemCachedClient;
import com.schooner.MemCached.MemcachedItem;

public class CommandGetCAS {
	
	public static void main(String[] args) {
		
		MemCachedClient memCachedClient = MemcachedFactory.createClient();
		
		memCachedClient.set("name", "qinjiangbo", timeExpire(5));
		//System.out.println("before cas: name = " + memCachedClient.get("name"));
		
		MemcachedItem item = memCachedClient.gets("name");
		//memCachedClient.cas("name", "chengying", item.getCasUnique());
		
		System.out.println("cas item: " + item.getCasUnique() + " : " + item.getValue());
	}
	
	private static Date timeExpire(int secs) {
		return new Date(System.currentTimeMillis() + secs * 1000);
	}
}
