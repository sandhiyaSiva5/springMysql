package com.example.SpringMysql.controller;

import com.example.SpringMysql.model.UserDetails;
import com.example.SpringMysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping

public class Controller {
    @Autowired
    private UserService service;
    @PostMapping
    public  String newUser(@RequestBody UserDetails user){
        return  service.adduser(user);

    }

    @GetMapping
    public  List<UserDetails> getUsers(){
        return  service.getAllUsers();
    }


    @PutMapping("/{id}")
    public  String updateUser(@RequestBody UserDetails user, @PathVariable int id){
        return service.updateUsers(user,id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        return  service.deleteuser(id);
    }

}
