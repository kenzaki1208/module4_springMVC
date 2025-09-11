package org.example.demospringmvc.week1.overview_with_spring_mvc.exercise.ex2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/week1/overview_with_spring_mvc/exercise/ex2")
public class DictionaryController {
    private static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("book", "quyển sách");
        dictionary.put("walk", "đi bộ");
    }

    @GetMapping
    public String home() {
        return "week1/overview_with_spring_mvc/exercise/ex2/index";
    }

    @PostMapping("/translate")
    public String translate(@RequestParam("word") String word, Model model) {
        String result = dictionary.get(word.toLowerCase());
        if (result != null) {
            model.addAttribute("word", word);
            model.addAttribute("result", result);
        } else {
            model.addAttribute("word", word);
            model.addAttribute("result", "không tìm thấy từ");
        }
        return "week1/overview_with_spring_mvc/exercise/ex2/index";
    }
}
