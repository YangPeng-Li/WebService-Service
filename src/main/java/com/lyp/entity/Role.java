package com.lyp.entity;

public class Role {
	private Integer id; //±àºÅ
	private String roleName; //½ÇÉ«Ãû³Æ
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Role(Integer id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
