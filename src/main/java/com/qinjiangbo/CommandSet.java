package com.qinjiangbo;

import java.util.Date;

import com.whalin.MemCached.MemCachedClient;

public class CommandSet {
	
	public static void main(String[] args) {
		
		MemCachedClient memCachedClient = MemcachedFactory.createClient();
		
		boolean result = memCachedClient.set("string", "qinjiangbo", timeExpire(5));
		System.out.println(result);
		
		result = memCachedClient.set("integer", new Integer(Integer.MAX_VALUE), timeExpire(5));
		System.out.println(result);
		
		result = memCachedClient.set("bool", Boolean.TRUE, timeExpire(5));
		System.out.println(result);
		
		result = memCachedClient.set("char", new Character('z'), timeExpire(5));
		System.out.println(result);
		
		result = memCachedClient.set("byte", new Byte((byte) 127), timeExpire(5));
		System.out.println(result);
		
		result = memCachedClient.set("stringbuffer", new StringBuffer("hello"), timeExpire(5));
		System.out.println(result);
		
		result = memCachedClient.set("short", new Short((short) 100), timeExpire(5));
		System.out.println(result);
		
		result = memCachedClient.set("long", new Long(Long.MAX_VALUE), timeExpire(5));
		System.out.println(result);
		
		result = memCachedClient.set("double", new Double(1.1), timeExpire(5));
		System.out.println(result);
		
		result = memCachedClient.set("float", new Float(1.1), timeExpire(5));
		System.out.println(result);
		
	}
	
	private static Date timeExpire(int secs) {
		return new Date(System.currentTimeMillis() + secs * 1000);
	}
}
 