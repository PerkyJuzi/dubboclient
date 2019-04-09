package com.example.dubboclient;

import org.springframework.boot.SpringApplication;

import javax.annotation.PostConstruct;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.HelloService;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboclientApplication {

	@Reference(version = "1.0.0")
  	private HelloService demoService;

	public static void main(String[] args) {
		
		SpringApplication.run(DubboclientApplication.class, args);
	}
	
    @PostConstruct
    public void init() {
    	int i = 1;
    	while(true) {
    		String sayHello = demoService.sayHello("lihf" + i++);
    		System.err.println("================" + sayHello + "================");
    		try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
}
