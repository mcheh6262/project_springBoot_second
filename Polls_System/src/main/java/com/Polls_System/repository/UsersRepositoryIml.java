package com.Polls_System.repository;

import com.Polls_System.model.Users;
import com.Polls_System.repository.mapper.UsersMapper;
import com.Polls_System.utils.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.Polls_System.utils.Constants.USER_TABLE_NAME;

@Repository
public class UsersRepositoryIml implements UsersRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public String createUsers(Users users) {
        String sql = "INSERT INTO" + Constants.USER_TABLE_NAME + "(first_name, last_name, email, age, address, joining_date) VALUES (?,?,?,?,?,?)";
        jdbcTemplate.update(sql, users.getFirst_name(), users.getLast_name(), users.getEmail(), users.getAge(), users.getAddress(), users.getJoining_date());
        return "Users make a registration";

    }

    @Override
    public String updateUsers(int id, String first_name) {
        String sql = "UPDATE" + Constants.USER_TABLE_NAME + "SET first_name = ?, WHERE id = ?";
        if (jdbcTemplate.update(sql, first_name, id) == 1) {
            return "User's name with id " + id + " was updated to " + first_name;
        } else {
            return "User with id " + id + " was not found";
        }
    }

    @Override
    public String deleteUsers(int id) {
        String sql = "DELETE FROM" + Constants.USER_TABLE_NAME + " WHERE id = ?";
        if (jdbcTemplate.update(sql, id) == 1) {
            return "User with id " + id + " was deleted";
        } else {
            return "User with id " + id + " was not found";
        }

    }

    @Override
    public Users getUsersById(Integer id) {
        String sql = "SELECT * FROM " + USER_TABLE_NAME + " WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new UsersMapper(), id);

    }

    @Override
    public List<Users> getAllUsers() {
        String sql = "SELECT * FROM " + USER_TABLE_NAME;
        return jdbcTemplate.query(sql, new UsersMapper());

    }

    @Override
    public List<Users> getRegisteredUsers(Integer id) {
        String sql;
        sql = "SELECT * FROM " + USER_TABLE_NAME + " WHERE id = ?";
        return jdbcTemplate.query(sql, new UsersMapper(), id);

    }

    @Override
    public int getRegisteredUsers() {
        return 0;
    }

    private String createKeyForUser(Integer id) {
        return "user id: " + id;
    }

}
