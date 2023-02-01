package com.example.butchershop.Service;

import com.example.butchershop.Entity.User;

public interface UserService {
    void save(User user);

    void login(String username, String password);
    User findByUsername(String username);
    User findByEmail(String email);
    User findById(long id);
}
