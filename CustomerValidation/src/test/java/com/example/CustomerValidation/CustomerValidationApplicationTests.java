package com.example.CustomerValidation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes=CustomerValidationApplication.class)
class CustomerValidationApplicationTests {
	@Autowired
	private CustomerController customercontroller;

	@Test
	void contextLoads() {
	}

}
