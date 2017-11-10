package com.xinfuli.yy.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.xinfuli.yy.demo.service.RedisService;

@Service
public class RedisServiceImpl implements RedisService {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;//操作字符串
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;//操作对象

	public void set(String key, String value) {
		stringRedisTemplate.opsForValue().set(key, value);
	}

	public String get(String key) {
		return stringRedisTemplate.opsForValue().get(key);
	}

	public boolean hasString(String key) {
		return stringRedisTemplate.hasKey(key);
	}

	public void deleteString(String key) {
		stringRedisTemplate.delete(key);
	}

	//-----------------------------字符串和对象操作分割线----------------------------//
	
	public Object getObject(String key) {
		return redisTemplate.opsForValue().get(key);
	}
	
	public void setObject(String key, Object obj) {
		redisTemplate.opsForValue().set(key, obj);
	}
	
	public boolean hasObject(String key) {
		return redisTemplate.hasKey(key);
	}

	public void deleteObject(String key) {
		redisTemplate.delete(key);
	}

}
