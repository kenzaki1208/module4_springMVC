package org.example.demospringmvc.week1.overview_with_spring_mvc.practice.p1.service;

import org.example.demospringmvc.week1.overview_with_spring_mvc.practice.p1.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleCustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John F. BuckingHam", "john@gmail.com", "Ha Noi"));
        customers.put(2, new Customer(2, "Mary J. Lottery", "mary@gmail.com", "Hai Phong"));
        customers.put(3, new Customer(3, "Adam N. Noop", "adam@gmail.com", "Da Nang"));
        customers.put(4, new Customer(4, "Jane J. Jackson", "jane@gmail.com", "Sai Gon"));
        customers.put(5, new Customer(5, "Jack D. Dump", "jack@gmail.com", "Ho Chi Minh"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }
}
