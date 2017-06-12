package com.teamtreehouse.instateam.web.controller;

import com.teamtreehouse.instateam.model.Collaborator;
import com.teamtreehouse.instateam.model.Project;
import com.teamtreehouse.instateam.model.Role;
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
        Role role = new Role("Developer");
        Project project = new Project("New Project", "It's nice!");
        Collaborator collaborator = new Collaborator("Jose Shavez",role);
        modelMap.put("project", project);
        modelMap.put("collaborator", collaborator);
        return "project_detail";
    }
}
