package com.example.Validate.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Customer {
	Address address;
	private String userName;
	private int phoneNo;
	private String accountType;
	private int AccountNumber;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getphoneNo() {
		return phoneNo;
	}
	public void setPhnumber(int phoneNo) {
		phoneNo = phoneNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	 public Customer() {}

	 public Customer(Address address, String userName, int phoneNo, String accountType,
			int accountNumber) {
		this.address = address;
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.accountType = accountType;
		AccountNumber = accountNumber;
	}
	
	
	
}	