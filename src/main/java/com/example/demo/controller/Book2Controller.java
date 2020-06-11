package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.servise.BookServise;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Book2Controller {
    BookServise bookServise;


    Book2Controller(BookServise bookServise) {
        this.bookServise = bookServise;
    }

    @GetMapping
    public List<Book> getAllBook() {
        return bookServise.getAllBook();
    }

    @DeleteMapping("/{id}")
    public String  delitId(@PathVariable int id) {
      return bookServise.deleteId(id);

    }
}
