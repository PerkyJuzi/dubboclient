package com.example.dubboserver;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboserverApplication {


	public static void main(String[] args) {
		
		// start embedded zookeeper server
		//new EmbeddedZooKeeper(2181, false).start();

		
		SpringApplication.run(DubboserverApplication.class, args);
	}
	
}
