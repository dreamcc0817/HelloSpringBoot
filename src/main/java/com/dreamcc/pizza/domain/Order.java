package com.dreamcc.pizza.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Demo
 * @Package: com.dreamcc.pizza.domain
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/8/1 11:22
 * @Version: V1.0
 */
public class Order implements Serializable {

	private static final long serialVersionUID = -7377550590103584923L;
	private Customer customer;
	private List<Pizza> pizzas;
	private Payment payment;

	public Order() {
		pizzas = new ArrayList<Pizza>();
		customer = new Customer();
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
}
