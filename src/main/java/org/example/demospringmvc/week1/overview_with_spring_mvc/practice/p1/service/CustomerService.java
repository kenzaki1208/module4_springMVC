package org.example.demospringmvc.week1.overview_with_spring_mvc.practice.p1.service;

import org.example.demospringmvc.week1.overview_with_spring_mvc.practice.p1.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
}
