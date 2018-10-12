package com.example.demo.idgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class mycustomer {
	
	
	@Id
//	@GenericGenerator(name="myid", strategy = "com.example.demo.cusomid.ownidgenerator")
	//@TableGenerator(name="employee_gen", pkColumnName="gen_name", valueColumnName="gen_val",table="id_gen",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
