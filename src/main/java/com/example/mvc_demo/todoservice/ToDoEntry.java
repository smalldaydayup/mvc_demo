package com.example.mvc_demo.todoservice;

import org.springframework.stereotype.Component;
import v1.TodoService;

/**
 * @author zhangkun
 */
@Component
public class ToDoEntry {
    private ToDoClient toDoClient;

    public TodoService.ReadAllResponse getAll() {
        toDoClient = ToDoClient.getTodoService();

        return toDoClient.getAll();
    }

    public TodoService.CreateResponse create() {
        toDoClient = ToDoClient.getTodoService();
        
        return toDoClient.create();
    }
}
