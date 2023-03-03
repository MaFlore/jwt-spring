package com.auth.jwt.jwtspring.repository;

import com.auth.jwt.jwtspring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
