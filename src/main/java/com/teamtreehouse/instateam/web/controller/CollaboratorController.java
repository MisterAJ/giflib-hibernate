package com.teamtreehouse.instateam.web.controller;

import com.teamtreehouse.instateam.model.Collaborator;
import com.teamtreehouse.instateam.service.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CollaboratorController {

    @Autowired
    private CollaboratorService collaboratorService;

    @SuppressWarnings("unchecked")
    @RequestMapping("/collaborators")
    public String listProjects(Model model) {
        List<Collaborator> collaboratorList = collaboratorService.findAll();
        model.addAttribute("collaborators", collaboratorList);
        return "collaborators";
    }
}
