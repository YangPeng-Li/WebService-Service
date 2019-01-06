package com.lyp.weservice;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


import com.lyp.adapter.MapAdapter;
import com.lyp.entity.Role;
import com.lyp.entity.User;

@WebService
public interface HelloWorld {
	public String say(String say);
	public  List<Role> getRoleByUser(User user);
	
	
	//获取用户所有的角色
	/**
	 * 
	 * @return
	 */
	@XmlJavaTypeAdapter(MapAdapter.class)
	public Map <String ,List<Role>>  getRole();
	
}
