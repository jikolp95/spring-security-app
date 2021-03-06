package com.yeldos.springsecurityapp.model;


import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.Set;

/**
 * Simple JavaBean object that represents role of (@link User)
 */
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
