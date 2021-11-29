package com.vishal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection="Customer")
public class Customer {
	@Id
	private int id;
	@Field
    private String customerName;
	@Field
    private String customerMail;
	@Field
    private int customerPhoneNum;
	@Field
    private String gender;
	public Customer(int id, String customerName, String customerMail, int customerPhoneNum, String gender) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerMail = customerMail;
		this.customerPhoneNum = customerPhoneNum;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerMail() {
		return customerMail;
	}
	public int getCustomerPhoneNum() {
		return customerPhoneNum;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", customerMail=" + customerMail
				+ ", customerPhoneNum=" + customerPhoneNum + ", gender=" + gender + "]";
	}
    
}
