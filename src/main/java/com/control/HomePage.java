package com.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/home")
public class HomePage {
    public static ArrayList<DetailsTask> allTask = new ArrayList<>();
    static {
        DetailsTask newTask =  new DetailsTask(1);
        newTask.setDescription("Create button for a task");

        DetailsTask newTask2 =  new DetailsTask(2);
        newTask2.setDescription("Make home page");
        allTask.add(newTask);
        allTask.add(newTask2);
    }
    @GetMapping
    public ModelAndView home() {
        return new ModelAndView("home", "task", allTask);
    }
}
