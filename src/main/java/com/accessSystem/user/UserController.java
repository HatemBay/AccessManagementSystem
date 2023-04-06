package com.choua9a.user;


import com.choua9a.login.LoginDTO;
import com.choua9a.login.LoginMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO) {
        LoginMessage loginMessage = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginMessage);
    }

    @PostMapping("/new")
    public int newUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(userDTO);
    }

    @PutMapping("/{id}")
    public int updateUser(@RequestBody UserDTO userDTO, @PathVariable int id) {
        return userService.modifyUser(userDTO, id);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.findUser(id);
    }

    @GetMapping("/email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.findUserByEmail(email);
    }

    @GetMapping("/get-all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}
