package org.example.demospringmvc.week2_data_binding_and_form_practice.p1.controller;

import org.example.demospringmvc.week2_data_binding_and_form_practice.p1.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/week2_data_binding_and_form_practice/p1/employee")
public class EmployeeController {
    @GetMapping("/show-form")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "week2_data_binding_and_form_practice/p1/employee/create";
    }

    @PostMapping("/add-employee")
    public String submit(@ModelAttribute("employee") Employee employee, Model model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "week2_data_binding_and_form_practice/p1/employee/info";
    }
}
