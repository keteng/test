package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@EnableEurekaClient   //只能使用eureka注册
@EnableDiscoveryClient	//可以使用多种，如zk等
@RestController
@SpringBootApplication //开启组件扫描和自动配置   
public class SpringBootDemoApplication {
	
	@RequestMapping("/")
	String say() {
		return "say" ;
	}
	public static void main(String[] args) {
		//负责启动引导应用程序
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
