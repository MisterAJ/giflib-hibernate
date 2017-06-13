package com.teamtreehouse.instateam.web.controller;

import com.teamtreehouse.instateam.model.Project;
import com.teamtreehouse.instateam.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @SuppressWarnings("unchecked")
    @RequestMapping("/")
    public String listProjects(Model model) {
        List<Project> projectList = projectService.findAll();
        model.addAttribute("projects", projectList);
        return "index";
    }


    @RequestMapping("/project/{Id}")
    public String projectDetails(@PathVariable Long Id, ModelMap modelMap) {
        Project project = projectService.findById(Id);
        // List<Collaborator> collaborators = project.getCollaborators();
        modelMap.put("project", project);
        // modelMap.put("collaborator", collaborators);
        System.out.println(project);
        return "project_detail";
    }
}
