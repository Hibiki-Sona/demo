package com.example.demo;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public List<User> findAll() {
        return jdbcTemplate.query(
                "SELECT * FROM users;",
                new BeanPropertyRowMapper<>(User.class)
        );
//        return List.of(
//                new UserEntity(1,"odakura","man","23")
//            );
    }

    public User findById(Integer id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM users WHERE id = ?;",
                new BeanPropertyRowMapper<>(User.class),
                id
        );
//        return new UserEntity(1, "odakura", "man", "23");
    }

    public void save(User user) {
        jdbcTemplate.update(
                "INSERT INTO users(name, gender, age) VALUES (?, ?, ?)",
                user.getName(),
                user.getGender(),
                user.getAge()
        );
    }

    public void update(User user) {
        jdbcTemplate.update("UPDATE users SET name = ?, gender = ?, age = ? WHERE id = ?;",
                user.getName(),
                user.getGender(),
                user.getAge(),
                user.getId()
        );
    }

    public void delete(Integer id) {
        jdbcTemplate.update("DELETE FROM users WHERE id = ?",
                id
        );
    }
}
