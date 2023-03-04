package com.auth.jwt.jwtspring.repository;

import com.auth.jwt.jwtspring.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByNomRole(String nomRole);

}
