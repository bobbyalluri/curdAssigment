package com.example.demo.idgenerator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.idgenerator.dao.EmployeeRepository;
import com.example.demo.idgenerator.entities.mycustomer;


@RunWith(SpringRunner.class)
@SpringBootTest
public class IdgeneratorsdataApplicationTests {

	@Autowired
	EmployeeRepository erp;
	@Test
	public void contextLoads() {
	}
	@Test
	public void createEmployee() {
		
		mycustomer emp=new mycustomer();
		//emp.setId(1);
		emp.setName("Sriramjee");
		erp.save(emp);
		emp.setName("rage");
		erp.save(emp);
	}
	
}
