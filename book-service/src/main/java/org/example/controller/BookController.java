package org.example.controller;

import org.example.entity.Book;
import org.example.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class BookController {

    @Resource
    BookService service;

    @RequestMapping("/book/{bid}")
    Book getBookById(@PathVariable("bid") int bid, HttpServletRequest httpServletRequest){
        System.out.println("Hello!");
        return service.getBookById(bid);
    }
}
