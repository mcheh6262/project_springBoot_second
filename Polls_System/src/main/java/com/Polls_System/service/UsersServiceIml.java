package com.Polls_System.service;

import com.Polls_System.model.Questions;
import com.Polls_System.model.Users;
import com.Polls_System.repository.UsersRepositoryIml;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceIml implements UsersService{

    @Autowired
    private UsersRepositoryIml usersRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public String createUsers(Users users) {
        if(usersRepository.getRegisteredUsers() == 1){
            try {
                System.out.println(objectMapper.writeValueAsString(users));
            }catch (JsonProcessingException e){
                throw new RuntimeException(e);
            }
            return usersRepository.createUsers(users);
        }else{
            return "The user is not registered";
        }

    }

    @Override
    public String updateUsers(int id, String first_name) {
        return usersRepository.updateUsers(id,first_name);
    }

    @Override
    public String deleteUsers(int id) {
        Users users = usersRepository.getUsersById(id);
        if (users != null){
            return usersRepository.deleteUsers(id);
        }
        else {
            return "User does not exist";

        }

    }

    @Override
    public Users getUsersById(Integer id) {
        return usersRepository.getUsersById(id);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.getAllUsers();
    }
}
