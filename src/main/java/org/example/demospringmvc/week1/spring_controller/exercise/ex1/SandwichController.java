package org.example.demospringmvc.week1.spring_controller.exercise.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/week1/spring_controller/exercise/ex1")
public class SandwichController {
    @GetMapping
    public String home() {
        return "week1/spring_controller/exercise/ex1/index";
    }

    @RequestMapping("/save")
    public String save(
            @RequestParam(
                    value = "condiment",
                    required = false
            ) String[] condiments,
            Model model
    ) {
        model.addAttribute("condiments", condiments);
        return "week1/spring_controller/exercise/ex1/result";
    }
}
