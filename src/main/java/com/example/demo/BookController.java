package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String findALl(Model model){
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

    @PostMapping("/books/buy")
    public String buy() {
        return "newbook";
    }

    @PostMapping("/books/save")
    public String save(@ModelAttribute Book book){
        bookService.save(book);
        return "redirect:/books";
    }

    @PostMapping("/books/update")
    public String update(@ModelAttribute Book book) {
        bookService.update(book);
        return "redirect:/books";
    }

    @PostMapping("/books/delete")
    public String delete(@RequestParam Integer id) {
        bookService.delete(id);
        return "redirect:/books";
    }

    @PostMapping("/books/add")
    public String add(@RequestParam Integer id) {
        bookService.add(id);
        return "redirect:/books";
    }

    @PostMapping("/books/subtract")
    public String subtract(@RequestParam Integer id) {
        bookService.subtract(id);
        return "redirect:/books";
    }
}
