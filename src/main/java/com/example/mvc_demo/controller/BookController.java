package com.example.mvc_demo.controller;


import com.example.mvc_demo.config.PlotBackgroundConfig;
import com.example.mvc_demo.entity.BgpData;
import com.example.mvc_demo.service.BookService;
import com.example.mvc_demo.service.RedisService;
import com.example.mvc_demo.todoservice.ToDoEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import v1.TodoService;

import java.util.Arrays;
import java.util.List;


/**
 * @author zhangkun
 */
@RestController
public class BookController {
    
    private final BookService bookService;

    private final ToDoEntry toDoEntry;
    private final RedisService redisService;
    @Autowired
    private PlotBackgroundConfig plotBackgroundConfig;

    public BookController(BookService bookService, ToDoEntry toDoEntry, RedisService redisService) {
        this.bookService = bookService;
        this.toDoEntry = toDoEntry;
        this.redisService = redisService;
    }

    @GetMapping("/book/title")
    public String getBookInfo() {
        String title = bookService.getAdTitle();
        System.out.println(bookService.getClass().getName());
        return title;
    }
    
    @GetMapping("book/info")
    public String getAll() {
        List<BgpData> data = plotBackgroundConfig.getList();
        TodoService.ReadAllResponse res = toDoEntry.getAll();

        return res.toString();
    }

    @GetMapping("book/redis")
    public String setRedis() {
        System.out.println(redisService.set("zk", "shendan"));
        return "kc sp";
    }

    @GetMapping("book/redisBatch")
    public String sIsMember() {
        System.out.println(redisService.sIsMemberBatch("zk", Arrays.asList("shendan", "sunping","wuchenchen", "liusongyang", "chenhong1")));
        return "get it";
    }
}
