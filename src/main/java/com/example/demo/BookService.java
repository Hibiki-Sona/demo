package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(Integer id) {
        return bookRepository.findById(id);
    }

    public Book findByName(String title) {
        return bookRepository.findByTitle(title);
    }

    public void save(Book book) {
        bookRepository.save(book);
    }

    public void update(Book book) {
        bookRepository.update(book);
    }

    public void delete(Integer id) {
        bookRepository.delete(id);
    }

    public void add(Integer id) {
        Book book = bookRepository.findById(id);
        book.setNumber(book.getNumber() + 1);
        bookRepository.update(book);
    }

    public void subtract(Integer id) {
        Book book = bookRepository.findById(id);
        book.setNumber(book.getNumber() - 1);
        if(book.getNumber() == 0){
            bookRepository.delete(id);
        }
        else{
            bookRepository.update(book);
        }
    }
}
