package com.lyp.entity;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 自定义实体cxf能接受
 * @author Administrator
 *
 */

@Component
public class MyRole {
	
	private String Key;
	private List <Role> value;
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	public List<Role> getValue() {
		return value;
	}
	public void setValue(List<Role> value) {
		this.value = value;
	}
	
	
	
	
	

}
