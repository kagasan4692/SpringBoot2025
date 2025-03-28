package com.kagasan.blog.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/blog")
    public String mainBlog(Model model) {
        model.addAttribute("title", "Страница блога");
        return "main-blog";
    }
}
