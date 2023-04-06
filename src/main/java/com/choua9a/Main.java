package com.choua9a;

import com.choua9a.user.Role;
import com.choua9a.user.User;
import com.choua9a.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.stream.Stream;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/").allowedOrigins("http://localhost:4200");
            }
        };
    }

    //bootstrapping
//    @Bean
//    CommandLineRunner init(UserRepository userRepository) {
//        return args -> {
//            Stream.of("customer2").forEach(name -> {
//                User user = new User(name,name + "Company" , name.toLowerCase() + "@test.com", "25656595", null, Role.CUSTOMER );
//                userRepository.save(user);
//            });
//            userRepository.findAll().forEach(System.out::println);
//        };
//    }
}
