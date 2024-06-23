package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String findALl(Model model){
        model.addAttribute("users", userService.findAll());
        return "users";
    }

    @PostMapping("/users/save")
    public String save(@ModelAttribute User user){
        userService.save(user);
        return "redirect:/users";
    }

    @PostMapping("/users/update")
    public String update(@ModelAttribute User user) {
        userService.update(user);
        return "redirect:/users";
    }

    @PostMapping("/users/delete")
    public String delete(@RequestParam Integer id) {
        userService.delete(id);
        return "redirect:/users";
    }
}
