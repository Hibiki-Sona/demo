//package com.example.demo.domain;
//
//import java.util.List;
//
//import com.example.demo.User;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServ {
//
//    private final UserRepo userRepository;
//
//    public UserServ(UserRepo userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public List<User> findAll() {
//        return userRepository.findAll();
//    }
//
//    public User findById(Integer id) {
//        return userRepository.findById(id);
//    }
//
//    public void save(User user) {
//        userRepository.save(user);
//    }
//
//    public void update(User user) {
//        userRepository.update(user);
//    }
//
//    public void delete(Integer id) {
//        userRepository.delete(id);
//    }
//}
