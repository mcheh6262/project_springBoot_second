package com.Polls_System.service;

import com.Polls_System.model.Users;

import java.util.List;

public interface UsersService {
    String createUsers(Users users);
    String updateUsers(int id, String first_name);
    String deleteUsers(int id);

    Users getUsersById(Integer id);
    List<Users> getAllUsers();
}
