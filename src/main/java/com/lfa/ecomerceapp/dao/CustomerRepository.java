package com.lfa.ecomerceapp.dao;

import com.lfa.ecomerceapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

Customer findByEmail(String theEmail);



}

