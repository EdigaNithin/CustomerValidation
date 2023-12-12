package com.example.CustomerValidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerservice;
	
	public CustomerService getCustomerservice() {
		return customerservice;
	}


	public void setCustomerservice(CustomerService customerservice) {
		this.customerservice = customerservice;
	}

	@PostMapping(path="/customer")
	public Customer saveCusto(@Valid @RequestBody Customer user, BindingResult bindingResult) {
		return customerservice.saveCustomer(user);
	}
	@GetMapping(path="/getting")
	public Iterable<Customer> getcustomer() {
		return customerservice.getall();
	}
	@PostMapping(path="/delete")
	public String deletecustomer() {
		 customerservice.deletecustomer();
		 return "CustomerDeleted";
	}
}