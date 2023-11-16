package com.Polls_System.model;

import java.sql.Date;

public class Users {
    private Integer id;
    private String first_name;
    private String last_name;
    private String email;
    private Integer age;
    private String address;
    private Date joining_date;

    public Users(Integer id, String first_name, String last_name, String email, Integer age, String address, Date joining_date) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.joining_date = joining_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(Date joining_date) {
        this.joining_date = joining_date;
    }

    @Override
    public String toString() {
        return  String.format("%s is a users with id %s and email number %s",this.first_name,this.id,this.email);
    }
}
