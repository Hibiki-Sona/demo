package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookRestController {

    private final BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/books/{id}")
    public Book findById(@PathVariable Integer id) {
        return bookService.findById(id);
    }

    @PutMapping("/books")
    public void save(@RequestBody Book books) {
        bookService.save(books);
    }

    @PutMapping("/books/{id}")
    public void update(@PathVariable Integer id, @RequestBody Book book) {
        book.setId(id);
        bookService.update(book);
    }

    @DeleteMapping("/books/{id}")
    public void delete(@PathVariable Integer id) {
        bookService.delete(id);
    }
}
