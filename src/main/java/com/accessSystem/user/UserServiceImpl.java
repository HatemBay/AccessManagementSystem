package com.accessSystem.user;

import com.accessSystem.login.LoginDTO;
import com.accessSystem.login.LoginMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public int addUser(UserDTO userDTO) {
        User user = new User(
                userDTO.getId(),
                userDTO.getName(),
                userDTO.getCompanyName(),
                userDTO.getEmail(),
                userDTO.getCin(),
                this.passwordEncoder.encode(userDTO.getPassword()),
                userDTO.getRole()
                );
        return userRepository.save(user).getId();
    }
    @Override
    public int modifyUser(UserDTO userDTO, int id) {
        User user = findUser(id);

        user.setId(id);
        user.setName(userDTO.getName());
        user.setCompanyName(userDTO.getCompanyName());
        user.setEmail(userDTO.getEmail());
        user.setCin(userDTO.getCin());
        user.setRole(userDTO.getRole());
        if (userDTO.getPassword().equals("")) {
            user.setPassword(user.getPassword());
        } else {
            user.setPassword(this.passwordEncoder.encode(userDTO.getPassword()));
        }

        return userRepository.save(user).getId();
    }
    @Override
    public User findUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public LoginMessage loginUser(LoginDTO loginDTO) {
        User user1 = userRepository.findUserByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            System.out.println(isPwdRight);
            if (isPwdRight) {
                Optional<User> user = userRepository.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginMessage("Login Success", HttpStatus.ACCEPTED);
                } else {
                    return new LoginMessage("Login Failed", HttpStatus.FORBIDDEN);
                }
            } else {
                return new LoginMessage("Passwords do not match", HttpStatus.FORBIDDEN);
            }
        }else {
            return new LoginMessage("Email does not exist", HttpStatus.FORBIDDEN);
        }
    }
}
