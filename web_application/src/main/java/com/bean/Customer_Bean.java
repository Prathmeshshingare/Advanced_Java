package com.bean;

public class Customer_Bean {
 private String custId;
 private String custName;
 
 public Customer_Bean(String custId, String custName) {
	super();
	this.custId = custId;
	this.custName = custName;
 }

 public Customer_Bean() {
	super();
	// TODO Auto-generated constructor stub
 }

 public String getCustId() {
	return custId;
 }

 public void setCustId(String custId) {
	this.custId = custId;
 }

 public String getCustName() {
	return custName;
 }

 public void setCustName(String custName) {
	this.custName = custName;
 }
 
 
}
