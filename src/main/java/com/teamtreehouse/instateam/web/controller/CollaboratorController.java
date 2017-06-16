package com.teamtreehouse.instateam.web.controller;

import com.teamtreehouse.instateam.model.Collaborator;
import com.teamtreehouse.instateam.model.Role;
import com.teamtreehouse.instateam.service.CollaboratorService;
import com.teamtreehouse.instateam.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CollaboratorController {

    @Autowired
    private CollaboratorService collaboratorService;

    @Autowired
    private RoleService roleService;

    @SuppressWarnings("unchecked")
    @RequestMapping("/collaborators")
    public String collaboratorIndex(Model model) {
        List<Collaborator> collaboratorList = collaboratorService.findAll();
        List<Role> roleList = roleService.findAll();
        model.addAttribute("collaborators", collaboratorList);
        model.addAttribute("roles", roleList);
        model.addAttribute("newCollaborator", new Collaborator());
        // TODO - Fix Nav Selected
        return "collaborators";
    }

    @RequestMapping(value="/collaborators", method = RequestMethod.POST)
    public String newCollaborator(@Valid Collaborator collaborator) {
        collaboratorService.save(collaborator);
        return "redirect:/collaborators";
    }
}
