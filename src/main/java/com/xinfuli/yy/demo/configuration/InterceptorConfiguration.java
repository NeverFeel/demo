package com.xinfuli.yy.demo.configuration;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.xinfuli.yy.demo.interceptor.MyInterceptor;

@Component
public class InterceptorConfiguration extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyInterceptor())
			.addPathPatterns("/insertStudent")//拦截路径
			.excludePathPatterns("/getRandomNumber");//不需要拦截的路径
		super.addInterceptors(registry);
	}
}
