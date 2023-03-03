package com.auth.jwt.jwtspring.service;

import com.auth.jwt.jwtspring.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<User> getAll();

    public User findById(Long id);

    public User findByEmail(String email);

    public User save(User user);

    public void addRoleToUser(String email, String nomRole);

    public User update(User user);

    public void deleteById(Long id);
}
