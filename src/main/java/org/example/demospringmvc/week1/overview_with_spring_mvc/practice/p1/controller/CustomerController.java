package org.example.demospringmvc.week1.overview_with_spring_mvc.practice.p1.controller;

import org.example.demospringmvc.week1.overview_with_spring_mvc.practice.p1.model.Customer;
import org.example.demospringmvc.week1.overview_with_spring_mvc.practice.p1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/week1/overview_with_spring_mvc/practice/p1/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("week1/overview_with_spring_mvc/practice/p1/customers/list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/detail")
    public ModelAndView showDetail(@RequestParam("id") int customerId) {
        ModelAndView modelAndView = new ModelAndView("week1/overview_with_spring_mvc/practice/p1/customers/info");
        Customer customer = customerService.findById(customerId);
        System.out.println(customer);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
}
