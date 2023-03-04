package com.auth.jwt.jwtspring.controller;

import com.auth.jwt.jwtspring.model.Role;
import com.auth.jwt.jwtspring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class RoleController {

    @Autowired
    public RoleService roleService;

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public List<Role> getAllRoles(){

        List<Role> roles = new ArrayList<>();
        try {
            roles = this.roleService.getAll();
        }catch (Exception e){
            System.out.println("Erreur " + e.getMessage());
        }
        return roles;
    }


}
