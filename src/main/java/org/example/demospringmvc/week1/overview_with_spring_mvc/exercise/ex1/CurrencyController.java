package org.example.demospringmvc.week1.overview_with_spring_mvc.exercise.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/week1/overview_with_spring_mvc/exercise/ex1")
public class CurrencyController {
    @GetMapping
    public String showForm() {
        return "week1/overview_with_spring_mvc/exercise/ex1/index";
    }

    @PostMapping("/convert")
    public String convert(
            @RequestParam("rate") double rate,
            @RequestParam("usd") double usd,
            Model model
    ) {
        double result = usd * rate;
        model.addAttribute("usd", usd);
        model.addAttribute("rate", rate);
        model.addAttribute("result", result);

        return "week1/overview_with_spring_mvc/exercise/ex1/result";
    }
}
