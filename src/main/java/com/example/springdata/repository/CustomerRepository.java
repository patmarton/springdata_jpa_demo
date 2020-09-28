package com.example.springdata.repository;

import java.util.List;

import com.example.springdata.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
    Customer findById(long id);

}
