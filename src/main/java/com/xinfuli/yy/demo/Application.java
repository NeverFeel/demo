package com.xinfuli.yy.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot启动
 */
@SpringBootApplication//相当于@Configuration，@EnableAutoConfiguration，@ComponentScan
@MapperScan("com.xinfuli.yy.demo.mapper")//扫描mapper包
/**
 * 
 * @ClassName: Application 
 * @Description: TODO
 * @author ilidan_Y
 * @date 2017年10月18日 下午12:19:15 
 *
 */
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
