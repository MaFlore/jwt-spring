package com.auth.jwt.jwtspring.serviceImpl;

import com.auth.jwt.jwtspring.model.Role;
import com.auth.jwt.jwtspring.model.User;
import com.auth.jwt.jwtspring.repository.RoleRepository;
import com.auth.jwt.jwtspring.repository.UserRepository;
import com.auth.jwt.jwtspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;
    @Autowired
    public RoleRepository roleRepository;

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Override
    public List<User> getAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return this.userRepository.findById(id).orElse(null);
    }

    @Override
    public User findByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    public User save(User user) {
        String password = user.getPassword();
        user.setPassword(passwordEncoder.encode(password));
        return this.userRepository.save(user);
    }

    @Override
    public void addRoleToUser(String email, String nomRole) {
        User user = userRepository.findByEmail(email);
        Role role = roleRepository.findByNomRole(nomRole);
        user.getRoles().add(role);
    }

    @Override
    public User update(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);
    }
}
