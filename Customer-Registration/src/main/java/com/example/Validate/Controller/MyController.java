package com.example.Validate.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Validate.entity.Address;
import com.example.Validate.entity.Customer;

import java.util.HashMap;
import java.util.Random;
import java.util.regex.Pattern;

@RestController
@RequestMapping("api/customerdetails")
@CrossOrigin(origins = "http://localhost:4200/")
public class MyController {
	
	  private static Random random = new Random();
	 
	  @PostMapping(path = "/Details")
	  public Customer createCustomer(@RequestBody Customer customer) {
			customer.setAccountNumber(random.nextInt());
			return customer;
		}	  
	  
	  @GetMapping(path = "/address")
	  public HashMap<String, String> addressCheck(Address address) {
			int pin = address.getPincode();
			String str = Integer.toString(pin);
			System.out.println("length" +str.length());
			if (str.length()==6) {
				HashMap<String, String> map = new HashMap<>();
			    map.put("key", "address is valid");			   
			    return map;				
			}
			else {
				HashMap<String, String> map = new HashMap<>();
			    map.put("key", "address is not valid");			   
			    return map;
			}
				
		}
	  
		
	    @GetMapping(path= "/creditcheck/{userName}")
	    public HashMap<String, String> creditValidation(@PathVariable String userName){       
	    	String uName =  userName;
			if(uName.length()>6)
			{ 
				HashMap<String, String> map = new HashMap<>();
			    map.put("key", "valid");
			   
			    return map;
			} 
			else
			{
				HashMap<String, String> map = new HashMap<>();
			    map.put("key", "not valid");
			   
			    return map;
	    } 
	    	

	    }
}

