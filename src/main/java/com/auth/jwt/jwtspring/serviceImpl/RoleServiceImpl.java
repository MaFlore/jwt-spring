package com.auth.jwt.jwtspring.serviceImpl;

import com.auth.jwt.jwtspring.model.Role;
import com.auth.jwt.jwtspring.repository.RoleRepository;
import com.auth.jwt.jwtspring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    public RoleRepository roleRepository;

    @Override
    public List<Role> getAll() {
        return this.roleRepository.findAll();
    }

    @Override
    public Role findById(Long id) {
        return this.roleRepository.findById(id).orElse(null);
    }

    @Override
    public Role findByNomRole(String nomRole) {
        return this.roleRepository.findByNomRole(nomRole);
    }

    @Override
    public Role save(Role role) {
        return this.roleRepository.save(role);
    }

    @Override
    public Role update(Role role) {
        return this.roleRepository.save(role);
    }

    @Override
    public void deleteById(Long id) {
        this.roleRepository.deleteById(id);
    }

}
