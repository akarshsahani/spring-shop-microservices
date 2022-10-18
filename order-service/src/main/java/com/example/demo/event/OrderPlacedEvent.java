package com.example.demo.event;



public class OrderPlacedEvent {

	private String orderNumber;

	public OrderPlacedEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderPlacedEvent(String orderNumber) {
		super();
		this.orderNumber = orderNumber;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	
}
