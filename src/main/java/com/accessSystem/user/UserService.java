package com.accessSystem.user;

import com.accessSystem.login.LoginDTO;
import com.accessSystem.login.LoginMessage;

import java.util.List;

public interface UserService {
    public int addUser(UserDTO userDTO);
    public int modifyUser(UserDTO userDTO, int id);
    public User findUser(int id);
    public User findUserByEmail(String email);
    public List<User> getAllUsers();
    public void deleteUser(int id);
    public LoginMessage loginUser(LoginDTO loginDTO);
}
