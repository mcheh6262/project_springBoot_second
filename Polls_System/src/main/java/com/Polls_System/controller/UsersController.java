package com.Polls_System.controller;

import com.Polls_System.model.Users;
import com.Polls_System.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping
    public String createUsers(@RequestBody Users users) {
        return usersService.createUsers(users);
    }
    @PutMapping
    public String updateUsers(@RequestParam int id, String first_name) {
        return usersService.updateUsers(id,first_name);
    }
    @DeleteMapping
    public String deleteUsers(@RequestParam int id) {
        return usersService.deleteUsers(id);
    }
    @GetMapping
    public Users getUsersById(@RequestParam Integer id) {
        return usersService.getUsersById(id);
    }
    @GetMapping(value = "/all")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

}
