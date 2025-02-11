package com.example.websecondlab.models;

import java.util.Set;

import com.example.websecondlab.consts.enums.RoleEnum;
import com.example.websecondlab.models.base.IdBaseEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends IdBaseEntity {

    private RoleEnum role;
    private Set<User> users;


    protected Role() {}


    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false)
    public RoleEnum getRole() {
        return role;
    }

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    public Set<User> getUsers() {
        return users;
    }


    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}