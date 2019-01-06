package com.lyp.weservice.impl;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.lyp.weservice.HelloWorld;

public class Server { 
	
	public static void main(String[] args) {
		System.out.println("web Service start");
		HelloWorld imp = new HelloWorldImpl();
		String address ="http://192.168.43.218/helloWorld";
		//Endpoint.publish(address, imp);//jdk实现 暴露webService接口
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		factoryBean.setAddress(address);//设置暴漏地址
		factoryBean.setServiceClass(HelloWorld.class);
		factoryBean.setServiceBean(imp);//设置实现类
		factoryBean.getInFaultInterceptors().add(new LoggingInInterceptor());//增加in拦截器 日志拦截器
		factoryBean.getOutFaultInterceptors().add(new LoggingOutInterceptor());//增加out 拦截器
		factoryBean.create();//创建WebService接口
		System.out.println("web Service started");
	}
}