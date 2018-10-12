package com.example.demo.cusomid;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ownidgenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		Random rg=new Random();
		Integer id=rg.nextInt(10);
		return "SEQ0000"+id.toString();
	}

	
	
}
