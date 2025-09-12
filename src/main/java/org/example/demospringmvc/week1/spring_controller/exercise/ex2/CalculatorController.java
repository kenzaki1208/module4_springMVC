package org.example.demospringmvc.week1.spring_controller.exercise.ex2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/week1/spring_controller/exercise/ex2")
public class CalculatorController {
    @GetMapping
    public String home() {
        return "week1/spring_controller/exercise/ex2/index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("num1") double num1,
            @RequestParam("num2") double num2,
            @RequestParam("operator") String operator,
            Model model
    ) {
        double result = 0;
        String message = "";
        switch (operator) {
            case "add":
                result = num1 + num2;
                message = "addition";
                break;
            case "sub":
                result = num1 - num2;
                message = "subtraction";
                break;
            case "mul":
                result = num1 * num2;
                message = "multiplication";
                break;
            case "div":
                if (num2 == 0) {
                    message = "division by zero";
                } else {
                    result = num1 / num2;
                    message = "division";
                }
                break;
        }
        model.addAttribute("message", message);
        model.addAttribute("result", result);

        return "week1/spring_controller/exercise/ex2/index";
    }
}
