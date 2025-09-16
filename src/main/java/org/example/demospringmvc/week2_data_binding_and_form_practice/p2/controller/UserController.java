package org.example.demospringmvc.week2_data_binding_and_form_practice.p2.controller;

import org.example.demospringmvc.week2_data_binding_and_form_practice.p2.DAO.UserDAO;
import org.example.demospringmvc.week2_data_binding_and_form_practice.p2.model.Login;
import org.example.demospringmvc.week2_data_binding_and_form_practice.p2.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/week2_data_binding_and_form_practice/p2")
public class UserController {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/week2_data_binding_and_form_practice/p2/home");
        modelAndView.addObject("login", new Login());
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login) {
        User user = UserDAO.checkLogin(login);
        ModelAndView modelAndView;
        if (user == null) {
            modelAndView = new ModelAndView("/week2_data_binding_and_form_practice/p2/error");
        } else {
            modelAndView = new ModelAndView("/week2_data_binding_and_form_practice/p2/user");
            modelAndView.addObject("user", user);
        }
        return modelAndView;
    }
}
