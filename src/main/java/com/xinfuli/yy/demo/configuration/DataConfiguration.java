package com.xinfuli.yy.demo.configuration;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataConfiguration implements ApplicationRunner {

	private boolean flag = true;
	
	/**
	 * SpringApplication应用启动后执行。
	 * 如果某些定义的CommandLineRunner或ApplicationRunner
	 * beans需要以特定的顺序调用，你可以实现org.springframework.core.Ordered接口
	 * 或使用org.springframework.core.annotation.Order注解。
	 */
	public void run(ApplicationArguments arg) throws Exception {
		while(flag){
			System.out.println("商品加载中...");
			flag = false;
		}
	}

}
