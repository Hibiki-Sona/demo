//package com.example.demo.web;
//
//import com.example.demo.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.ui.Model;
//
//import com.example.demo.domain.UserServ;
//
//
//@Controller
//public class UserCon {
//
//    private final UserServ userService;
//
//    public UserCon(UserServ userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/users")
//    public String findALl(Model model){
//        model.addAttribute("users", userService.findAll());
//        return "users";
//    }
//
//    @PostMapping("/users/save")
//    public String save(@ModelAttribute User user){
//        userService.save(user);
//        return "redirect:/users";
//    }
//}
