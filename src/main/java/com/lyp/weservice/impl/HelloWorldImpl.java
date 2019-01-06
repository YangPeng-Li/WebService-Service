package com.lyp.weservice.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.lyp.entity.Role;
import com.lyp.entity.User;
import com.lyp.weservice.HelloWorld;

@WebService
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String say(String say) {
		return "Hello :"+say;
	}

	@Override
	public List<Role> getRoleByUser(User user) {
		List<Role> roleList  = new ArrayList<Role>();
		//模拟
		if(user != null)
		{
			if(user.getUserName().equals("java1234")&& user.getPassword().equals("123456"))
			{
				roleList.add(new Role(1,"管理员"));
				roleList.add(new Role(2,"CTO"));
			}
			else if(user.getUserName().equals("Tom")&&user.getPassword().equals("123456"))
			{
				roleList.add(new Role(3,"coder"));
				roleList.add(new Role(4,"Programer"));
			}
		}
		return roleList;
	}

	@Override
	public Map<String, List<Role>> getRole() {
		Map<String,List<Role>> map = new HashMap<String,List<Role>>();
		List<Role> roleList = new ArrayList<Role>();
		roleList.add(new Role(1,"技术总监"));
		roleList.add(new Role(2,"架构师"));
		
		map.put("java1234", roleList);
		
		List<Role> roleList2 = new ArrayList<Role>();
		roleList2.add(new Role(3,"Programer"));
		map.put("Tom", roleList2);
		return map;
	}

}
