package com.lyp.MainConfig;

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import com.lyp.weservice.ZH;
import com.lyp.weservice.impl.Application;
import com.lyp.weservice.impl.ZHImpl;

@Configuration
@EnableAutoConfiguration
public class WS_ZHApplication {
	
	
	public static void main(String[] args) 
	{
		System.out.println("Web service Start");
		ZH say = new  ZHImpl();
		String address ="http://192.168.43.218/say";
		Endpoint.publish(address, say);
		System.out.println("Web service Started");
		SpringApplication.run(Application.class, args);
		
	}

}


