package kataacademy.springbootdemo.service;

import kataacademy.springbootdemo.model.User;

import java.util.List;

public interface UserService {
    User findById (Long id);
    List<User> findAll();
    void saveUser(User user);
    void deleteById(Long id);
}
