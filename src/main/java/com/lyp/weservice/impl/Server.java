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
		//Endpoint.publish(address, imp);//jdkʵ�� ��¶webService�ӿ�
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		factoryBean.setAddress(address);//���ñ�©��ַ
		factoryBean.setServiceClass(HelloWorld.class);
		factoryBean.setServiceBean(imp);//����ʵ����
		factoryBean.getInFaultInterceptors().add(new LoggingInInterceptor());//����in������ ��־������
		factoryBean.getOutFaultInterceptors().add(new LoggingOutInterceptor());//����out ������
		factoryBean.create();//����WebService�ӿ�
		System.out.println("web Service started");
	}
}