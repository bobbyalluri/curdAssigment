package com.example.demo.main.myid;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mysql.fabric.xmlrpc.base.Array;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyIdApplicationTests {

	@Autowired
	beanidrepo idp;
	@Test
	public void contextLoads() {
	}
	
	@Test
    public void createdata() {
    	/*entitybeanid bid=new entitybeanid();
    	bid.setName("niharika");
    	bid.setEmail("niharica@mail.com");
    	idp.save(bid);*/
    }

	@Test
    public void readData() {
    	
		List<entitybeanid> bid=idp.findByNameAndEmail("ibm", "ibmwar89@mail.com");
		for(entitybeanid bids:bid) {
			System.out.println(bids.getName()+","+bids.getEmail());
		}
    }
	@Test
	public void likeData()
	{
		List<entitybeanid> bid=idp.findByEmailLike("%mail%");
		for(entitybeanid bids:bid) {
			System.out.println(bids.getName()+","+bids.getEmail());
		}
	}
	@Test
	public void inData()
	{
		List<entitybeanid> bid=idp.findByIdIn(Arrays.asList(1,2,4));
		for(entitybeanid bids:bid) {
			System.out.println(bids.getName()+","+bids.getEmail());
		}
	}
}
