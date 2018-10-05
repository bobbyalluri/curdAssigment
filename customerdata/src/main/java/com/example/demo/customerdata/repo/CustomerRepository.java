package com.example.demo.customerdata.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.customerdata.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
