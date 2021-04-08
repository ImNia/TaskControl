package com.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static com.control.HomePage.allTask;

@Controller
public class ControlPage {

    @RequestMapping(value="/task")
    public ModelAndView pageTask() {
        return new ModelAndView("pageTask");
    }

    @GetMapping("/createTask")
    public String descriptionNewTaskForm(Model model) {
        model.addAttribute("task", new DetailsTask());
        System.out.println("In description GET");
        return "createTask";
    }

    @PostMapping("/createTask")
    public String descriptionNewTask(@ModelAttribute("task") DetailsTask task, Model model) {
        System.out.println(task);
        model.addAttribute("task", task);
        allTask.add(task);
        System.out.println("In description POST: " + task.getIdTask() + " : " + task.getDescription());
        return "createTask" ;
    }
}
