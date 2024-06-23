//package com.example.demo.web;
//
//import com.example.demo.User;
//import com.example.demo.domain.UserServ;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class UserRestCon {
//
//    private final UserServ service;
//
//    public UserRestCon(UserServ service) {
//        this.service = service;
//    }
//
//    @GetMapping("/users")
//    public List<User> findAll() {
//        return service.findAll();
//    }
//
//    @GetMapping("/users/{id}")
//    public User findById(@PathVariable Integer id) {
//        return service.findById(id);
//    }
//
//    @PostMapping("/users")
//    public void save(@RequestBody User user) {
//        service.save(user);
//    }
//
//    @PutMapping("/users/{id}")
//    public void update(@PathVariable Integer id, @RequestBody User user) {
//        user.setId(id);
//        service.update(user);
//    }
//
//    @DeleteMapping("/users/{id}")
//    public void delete(@PathVariable Integer id) {
//        service.delete(id);
//    }
//}
