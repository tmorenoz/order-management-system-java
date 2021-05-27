package com.tmzdev.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection="orders")
public class Order {
	@Id
	private int id;
	private String orderNumber;
	private String condition;
	private String date;
	private String custumer;
	private String taxAmounts;
	private String totalTaxes;
	private String totalQuantity;
	private String orderItemList;
	
	
	public Order() {
		super();
	}
	
	public Order(int id, String orderNumber, String condition, String date, String custumer, String taxAmounts,
			String totalTaxes, String totalQuantity, String orderItemList) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.condition = condition;
		this.date = date;
		this.custumer = custumer;
		this.taxAmounts = taxAmounts;
		this.totalTaxes = totalTaxes;
		this.totalQuantity = totalQuantity;
		this.orderItemList = orderItemList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCustumer() {
		return custumer;
	}

	public void setCustumer(String custumer) {
		this.custumer = custumer;
	}

	public String getTaxAmounts() {
		return taxAmounts;
	}

	public void setTaxAmounts(String taxAmounts) {
		this.taxAmounts = taxAmounts;
	}

	public String getTotalTaxes() {
		return totalTaxes;
	}

	public void setTotalTaxes(String totalTaxes) {
		this.totalTaxes = totalTaxes;
	}

	public String getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public String getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(String orderItemList) {
		this.orderItemList = orderItemList;
	}
	
	
	
	

}
