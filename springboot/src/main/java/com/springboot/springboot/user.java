package com.springboot.springboot;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class user {
	@Id
	private String uname;
	private String udepartment;
	private String udesignation;
	public user(String uname, String udepartment, String udesignation) {
		super();
		this.uname = uname;
		this.udepartment = udepartment;
		this.udesignation = udesignation;
		
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUdepartment() {
		return udepartment;
	}
	public void setUdepartment(String udepartment) {
		this.udepartment = udepartment;
	}
	public String getUdesignation() {
		return udesignation;
	}
	public void setUdesignation(String udesignation) {
		this.udesignation = udesignation;
	}
	@Override
	public String toString() {
		return "user [uname=" + uname + ", udepartment=" + udepartment + ", udesignation=" + udesignation + "]";
	}
	
	

}
