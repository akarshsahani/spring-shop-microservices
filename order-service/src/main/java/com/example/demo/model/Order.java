package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_Order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String orderNumber;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<OrderLineItems> OrderLineItemsList;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Long id, String orderNumber, List<OrderLineItems> orderLineItemsList) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		OrderLineItemsList = orderLineItemsList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List<OrderLineItems> getOrderLineItemsList() {
		return OrderLineItemsList;
	}

	public void setOrderLineItemsList(List<OrderLineItems> orderLineItemsList) {
		OrderLineItemsList = orderLineItemsList;
	}
	
	
}
