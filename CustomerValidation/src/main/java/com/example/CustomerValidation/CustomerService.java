package com.example.CustomerValidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	private CutomerRepository repo;
	
	public Iterable<Customer> getall() {
		return repo.findAll();
	}
	public Customer saveCustomer(Customer c) {
		return repo.save(c);
	}
	public void deletingid(Long id) {
		repo.deleteById(id);
	}
	public void deletecustomer() {
		repo.deleteAll();
		
		
	}
	
	

}
