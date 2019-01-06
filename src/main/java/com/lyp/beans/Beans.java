package com.lyp.beans;

import com.lyp.beans.Beans.BODY;

/**
 * 此类是测试commons-beanutils中的一个方法
 * 
 *	@author Lyp
 * 2018年12月9日
 * 下午12:17:30
 */
public class Beans {
	
	protected BODY body ;
	
	
	public BODY getBody() {
		return body;
	}

	public void setBody(BODY value) {
		this.body = value;
	}
	
	public static class BODY 
	{
		protected DATASTORS datastors ;
		
		public DATASTORS getDATASTORS ()
		{
			return datastors;
		}
		public void setDATASTORS (DATASTORS value)
		{
			this.datastors = value;
		}
		
	}
	
	
	public static class DATASTORS {
		protected DS ds;
		
		public DS getDS  (){
			return ds;
		}
		
		public void setDS (DS value) {
			this.ds = value;
		}
	}
	
	
	
	public static class DS {
		protected PARAMETES parametes ;
		
		public PARAMETES getPARAMETES ()
		{
			return parametes;
		}
		
		public void setPARAMETES(PARAMETES value)
		{
			this.parametes = value;
		}
		
	}
	
	
	
	
	public static class PARAMETES {
		protected String id;
		protected String name;
		protected String job;
		protected String Tell;
		protected String Address;
		protected String Email;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			this.Email = email;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			this.Address = address;
		}
		public String getTell() {
			return Tell;
		}
		public void setTell(String tell) {
			this.Tell = tell;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		
		
		
	}


}
