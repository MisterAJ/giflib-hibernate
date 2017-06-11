package com.teamtreehouse.instateam.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoleController {
    @RequestMapping("/roles")
    public String listRoles() {
        return "roles";
    }
}
