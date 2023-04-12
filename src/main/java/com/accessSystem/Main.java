package com.accessSystem;

import com.accessSystem.demand.Choice;
import com.accessSystem.demand.Demand;
import com.accessSystem.user.User;
import com.accessSystem.user.UserRepository;
import com.accessSystem.demand.DemandRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Date;
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

//    @Bean
//    CommandLineRunner init(DemandRepository demandRepository, UserRepository userRepository) {
//        User user = userRepository.findById(6).orElse(null);
//        System.out.println(user);
//        return args -> {
//            Stream.of("demand1, demand2").forEach(name -> {
//                Demand demand = new Demand(user,"www." + name + ".com" ,"sdff",name + "Company" , Choice.YES, Choice.YES, new Date(), new Date(), "09:00", "11:00", "sqxesq", "25656595", new Date(), new Date());
//                demandRepository.save(demand);
//            });
//            demandRepository.findAll().forEach(System.out::println);
//        };
//    }
}
