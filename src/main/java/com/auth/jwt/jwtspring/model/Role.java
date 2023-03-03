package com.auth.jwt.jwtspring.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nom_role")
    private String nomRole;

    public Role(){

    }

    public Role(String nomRole){
        this.nomRole = nomRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomRole(){
        return nomRole;
    }

    public void setNomRole(String nomRole){
        this.nomRole = nomRole;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", nomRole='" + nomRole + '\'' +
                '}';
    }
}
