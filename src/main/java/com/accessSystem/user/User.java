package com.accessSystem.user;

import com.accessSystem.demand.Demand;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String name;
    private String companyName;
    private String email;
    private String cin;
    private String password;
    private Role role;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    List<Demand> demands;

    public User(int id, String name, String companyName, String email, String cin, String password, Role role) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.email = email;
        this.cin = cin;
        this.password = password;
        this.role = role;
    }

    public User(String name, String companyName, String email, String cin, String password, Role role) {
        this.name = name;
        this.companyName = companyName;
        this.email = email;
        this.cin = cin;
        this.password = password;
        this.role = role;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(companyName, user.companyName) && Objects.equals(email, user.email) && Objects.equals(cin, user.cin) && Objects.equals(password, user.password) && role == user.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, companyName, email, cin, password, role);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", email='" + email + '\'' +
                ", cin='" + cin + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
