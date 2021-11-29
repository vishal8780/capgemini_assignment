package com.nil.SpringC7;

import org.springframework.beans.factory.annotation.Value;

public class PaymentProcess {
	

	@Value("#{OrderDetails}")
	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void Display() {
		
		System.out.println(order.getPrice()+""+order.getItemName()+""+order.getAdreess());
	}
	

}
