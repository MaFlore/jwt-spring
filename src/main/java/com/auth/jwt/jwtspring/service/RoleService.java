package com.auth.jwt.jwtspring.service;

import com.auth.jwt.jwtspring.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {

    public List<Role> getAll();

    public Role findById(Long id);

    public Role findByNomRole(String nomRole);

    public Role save(Role role);

    public Role update(Role role);

    public void deleteById(Long id);
}
