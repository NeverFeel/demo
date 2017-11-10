package com.xinfuli.yy.demo.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xinfuli.yy.demo.common.CommonResult;
import com.xinfuli.yy.demo.service.RedisService;

@RestController
public class HelloController {
	
	@Autowired
	private RedisService redisService;
	
	@RequestMapping(value = "/now",method = RequestMethod.GET)
	public String now(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		return df.format(date);
	}

	@RequestMapping(value="/saveCache",method=RequestMethod.GET)
	public CommonResult redisSetTest(@RequestParam("key") String key,@RequestParam("value") String value){
		redisService.set(key, value);
		return new CommonResult("存储成功!");
	}
	
	@RequestMapping(value="/getCache",method=RequestMethod.GET)
	public CommonResult redisGetTest(@RequestParam("key") String key){
		String value = redisService.get(key);
		return new CommonResult(value);
	}
	
}
