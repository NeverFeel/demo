package com.xinfuli.yy.demo.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.xinfuli.yy.demo.filter.MyFilter;

@Component
public class FilterConfiguration {

	@Bean
	public FilterRegistrationBean myFilterRegistrationBean(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		MyFilter filter = new MyFilter();
		List<String> urls = new ArrayList<String>();
		urls.add("/insertStudent");
		urls.add("/getRandomNumber");
		filterRegistrationBean.setName("myFilter");
		filterRegistrationBean.setFilter(filter);
		filterRegistrationBean.setOrder(1);
		filterRegistrationBean.setUrlPatterns(urls);
		return filterRegistrationBean;
	}
	
}
