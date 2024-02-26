package com.dongli.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ToDoController {
    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("list-todos")
    public String listAllToDos(ModelMap modelMap) {
        List<ToDo> todos = toDoService.findByUsername("dongli");
        modelMap.addAttribute("todos", todos);
        return "listToDos";
    }

}
