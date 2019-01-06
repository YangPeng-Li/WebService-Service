package com.lyp.weservice.impl;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.lyp.weservice.HelloWorld;



@ComponentScan
@Configuration
@EnableAutoConfiguration
public class Application {

	protected SpringApplicationBuilder configure (SpringApplicationBuilder builder)
	{
		return builder.sources(Application.class);
	}
	
	
	@Autowired
	private ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		
		System.out.println("web Service start");
		HelloWorld imp = new HelloWorldImpl();
		String address ="http://192.168.43.218/helloWorld";
		//Endpoint.publish(address, imp);//jdkʵ�� ��¶webService�ӿ�
		
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		factoryBean.setAddress(address);//���ñ�©��ַ
		factoryBean.setServiceClass(HelloWorld.class);
		factoryBean.setServiceBean(imp);//����ʵ����
		factoryBean.getInFaultInterceptors().add(new LoggingInInterceptor());//����in������ ��־������
		factoryBean.getOutFaultInterceptors().add(new LoggingOutInterceptor());//����out ������
		factoryBean.create();//����WebService�ӿ�
		System.out.println("web Service started");
		
		SpringApplication.run(Application.class, args);
	}
	
}
