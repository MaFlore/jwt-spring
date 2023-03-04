package com.auth.jwt.jwtspring.controller;


import com.auth.jwt.jwtspring.model.User;
import com.auth.jwt.jwtspring.service.UserService;
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
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getAllUsers(){

        List<User> users = new ArrayList<>();

        try{
            users = userService.getAll();
        }catch (Exception e){
            System.out.println("Erreur " + e.getMessage());
        }
        return users;
    }
}
