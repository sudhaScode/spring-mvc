package com.concept.spring.mvc.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concept.spring.mvc.controller.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
