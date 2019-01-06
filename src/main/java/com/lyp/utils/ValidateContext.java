package com.lyp.utils;

import java.util.Map;

public class ValidateContext {
	
	private Map <String ,Object> data;
	private Map <String ,Object> context;
	
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	public Map<String, Object> getContext() {
		return context;
	}
	public void setContext(Map<String, Object> context) {
		this.context = context;
	}
	
	public void setDadaValue (String key,Object value)
	{
		data.put(key, value);
	}
	
	public Object getDataValue (String key)
	{
		return data.get(key);
	}
	
	public void setConfigValue (String key,Object value)
	{
		context.put(key, value);
		
	}
	public Object getConfigValue (String key)
	{
		return context.get(key);
	}
}
