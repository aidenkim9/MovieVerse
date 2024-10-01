package com.example.MovieVerse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping

@Controller
public class PageController{

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/search")
    public String account(){
        return  "search";

    @GetMapping("/category")
    public String category(){
        return "category";
    }

    @GetMapping("/rating")
    public String rating(){
        return "rating";
    }

    @GetMapping("/account")
    public String account(){
        return  "account";
    }

}