package org.example.demospringmvc.week1.spring_controller.practice.p1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/week1/spring_controller/practice/p1")
public class HomeController {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern;

    public HomeController() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @GetMapping
    public String home() {
        return "week1/spring_controller/practice/p1/home";
    }

    @PostMapping("/validate")
    public String user(@RequestParam("email") String email, ModelMap modelMap) {
        boolean isValid = this.validate(email);
        if (!isValid) {
            modelMap.addAttribute("message", "Email is invalid");
            return "week1/spring_controller/practice/p1/home";
        }
        modelMap.addAttribute("email", email);
        return "week1/spring_controller/practice/p1/success";
    }

    private boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
