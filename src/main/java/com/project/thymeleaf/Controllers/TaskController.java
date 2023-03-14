package com.project.thymeleaf.Controllers;

import com.project.thymeleaf.models.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController {

    List<Task> listTasks = new ArrayList<>();
    @GetMapping("/create")
    public String home(){
        return "create";
    }

    @PostMapping("/create")
    public String create(Task task){
        Long id = listTasks.size() +1L;
        task.setId(id);
        listTasks.add(new Task(id, task.getName(), task.getDate()));
        return "redirect:/list";
    }

    @GetMapping("/list")
    public ModelAndView listAll(){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("tasks", listTasks);
        return modelAndView;
    }


    @GetMapping("/update/{id}")
    public ModelAndView create(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView("create");
        Task taskFind = listTasks.stream().filter(task -> id.equals(task.getId())).findFirst().get();
        modelAndView.addObject("task", taskFind);
        return modelAndView;
    }
}
