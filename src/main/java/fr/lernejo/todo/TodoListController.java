package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {
    private List<Todo> todos = new ArrayList<Todo>();

    @GetMapping("/api/todo")
    public List<Todo> getTodos() {
        return todos;
    }

    @PostMapping(value = "/api/todo", consumes = {"application/json"})
    public void addTodo(@RequestBody Todo todo) {
        todos.add(todo);
    }
}
