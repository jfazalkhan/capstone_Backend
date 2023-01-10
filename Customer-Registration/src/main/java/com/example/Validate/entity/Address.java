package com.example.Validate.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
		private int HouseNo;
		private String area;
		private int pincode;
		public int getHouseNo() {
			return HouseNo;
		}
		public void setHouseNo(int houseNo) {
			HouseNo = houseNo;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		
		public Address() {
			
		}	
		public Address(int houseNo, String area, int pincode) {
			super();
			HouseNo = houseNo;
			this.area = area;
			this.pincode = pincode;
		}			
}
