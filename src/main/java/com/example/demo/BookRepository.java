package com.example.demo;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    private final JdbcTemplate jdbcTemplate;

    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> findAll() {
        return jdbcTemplate.query(
                "SELECT * FROM books;",
                new BeanPropertyRowMapper<>(Book.class)
        );
    }

    public Book findById(Integer id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM books WHERE id = ?;",
                new BeanPropertyRowMapper<>(Book.class),
                id
        );
    }

    public Book findByTitle(String title) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM books WHERE title = ?;",
                new BeanPropertyRowMapper<>(Book.class),
                title
        );
    }

    public void save(Book book) {
        jdbcTemplate.update(
                "INSERT INTO books(title, category, number, uid) VALUES (?, ?, ?, ?);",
                book.getTitle(),
                book.getCategory(),
                book.getNumber(),
                book.getUid()
        );
    }

    public void update(Book book) {
        jdbcTemplate.update(
                "UPDATE books SET title = ?, category = ?, number = ?, uid = ? WHERE id = ?;",
                book.getTitle(),
                book.getCategory(),
                book.getNumber(),
                book.getUid(),
                book.getId()
        );
    }

    public void delete(Integer id) {
        jdbcTemplate.update(
                "DELETE FROM books WHERE id = ?;",
                id
        );
    }
}
