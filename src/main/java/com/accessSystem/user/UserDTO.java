package com.accessSystem.user;

public class UserDTO {
    private int id;
    private String name;
    private String companyName;
    private String email;
    private String password;
    private String cin;
    private Role role;

    public UserDTO(int id, String name, String companyName, String email, String password, String cin, Role role) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.email = email;
        this.cin = cin;
        this.password = password;
        this.role = role;
    }

    public UserDTO() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
