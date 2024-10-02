package com.example.MovieVerse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/category")
    public String category() {
        return "category";  // 'category.html' 템플릿으로 이동
    }

    @GetMapping("/rating")
    public String rating() {
        return "rating";
    }

    @GetMapping("/search")
    public String search() {
        return "search";
    }
}
