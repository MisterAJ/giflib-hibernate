package com.teamtreehouse.instateam.web.controller;

import com.teamtreehouse.instateam.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProjectController {
    @RequestMapping("/")
    public String listProjects() {
        return "index";
    }

    @RequestMapping("/project/detail")
    public String projectDetails(ModelMap modelMap) {
        Project project = new Project("New Project", "It's nice!");
        modelMap.put("project", project);
        return "project_detail";
    }
}
