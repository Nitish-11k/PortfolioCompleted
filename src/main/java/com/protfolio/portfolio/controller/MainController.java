package com.protfolio.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String portfolio(Model model) {
        model.addAttribute("title", "Portfolio");
        return "home";
    }

    @RequestMapping("/about")
    public String homePage(Model model){
        model.addAttribute("title", "Home");
        return "about";
    }

    @RequestMapping("/skills")
    public String mySkils(Model model){
        model.addAttribute("title", "Skills");
        return "skills";
    }
    @RequestMapping("/projects")
    public String myProjects(Model model){
        model.addAttribute("title", "Projects");
        return "projects";
    }
    

}
