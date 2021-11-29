package com.vishal.assignmen2;
import java.util.ArrayList; 

import java.util.List;  
import org.springframework.stereotype.Component;  
@Component  
public class AddressDaoService {
	

	 public static int usersCount=5;  
	//creating an instance of ArrayList  
	private static List<Address> users=new ArrayList<>();  
	//static block   
	static  
	{  
	//adding users to the list  
	users.add(new Address(508213, "Hyderabad","TS","INDIA"));
	users.add(new Address(508222, "Banglore","KA","INDIA"));
	users.add(new Address(508214, "Chennei","TM","USA"));
	users.add(new Address(567890, "Mumbai","MH","UK"));
	
	}  
	//method that retrieve all users from the list  
	public List<Address> findAll()  
	{  
	return users;  
	}  
	//method that add the user in the list   
	public Address save(Address user)  
	{  
	if(user.getId()==null)  
	{  
	//increments the user id  
	user.setId(++usersCount);  
	}  
	users.add(user);  
	return user;  
	}  
	//method that find a particular user from the list  
	public Address findOne(int id)  
	{  
	for(Address user:users)  
	{  
	if(user.getId()==id)  
	return user;  
	}  
	return null;  
	}  
	}  


