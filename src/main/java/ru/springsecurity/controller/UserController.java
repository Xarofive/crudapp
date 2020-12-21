package ru.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.springsecurity.service.UserService;

import java.security.Principal;


@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/welcome")
    public String forOtherRoles() {
        return "welcome";
    }

    @GetMapping("/user")
    public String clickMe(Model model, Principal principal) {
        model.addAttribute("oneUser", userService.getUserByUsername(principal.getName()));
        return "show-me";
    }
}
