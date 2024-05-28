package com.example.SpringMysql.service;

import com.example.SpringMysql.Repository.UserRepository;
import com.example.SpringMysql.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.List;
@Service

public class UserService {
    @Autowired
    private UserRepository repository;
    public  String adduser(UserDetails user){
      //  repository.save(user);
      //  return "user added";
        if()
    }

    public List<UserDetails> getAllUsers(){
        return  repository.findAll();

    }

    public  String updateUsers(UserDetails user, int id){
        UserDetails existing = repository.findById(id).get();
        existing.setUsername(user.getUsername());
        existing.setEmail(user.getEmail());
        existing.setAge(user.getAge());
        repository.save(existing);
        return "use updated";
    }

    public String deleteuser (int id){
        repository.deleteById(id);
        return "user deleted";
    }



}
