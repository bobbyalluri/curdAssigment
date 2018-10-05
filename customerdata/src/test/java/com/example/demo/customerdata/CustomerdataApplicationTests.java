package com.example.demo.customerdata;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.customerdata.entity.Customer;
import com.example.demo.customerdata.repo.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdataApplicationTests {

	@Autowired
	CustomerRepository cust_repo;
	@Test
	public void contextLoads() {
	}


	@Test
	public void testCreate() {
		Customer cust=new Customer();
		cust.setId(3);
		cust.setName("Sriramjee");
		cust.setEmail("Sriramjee.alluri55@gmail.com");
		cust_repo.save(cust);
	}
	@Test
	public void testRead() {
		
	Customer cust=	cust_repo.findById(3).get();
	assertNotNull(cust);
	
	}
	@Test
	public void testUpdate() {
		
	Customer cust=	cust_repo.findById(3).get();
	cust.setName("Sriramjee");
	cust_repo.save(cust);
	}
	@Test
	public void testDelete() {
		
	if(cust_repo.existsById(3))
	cust_repo.deleteById(3);
	}
}
