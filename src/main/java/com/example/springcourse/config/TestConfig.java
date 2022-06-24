package com.example.springcourse.config;

import com.example.springcourse.entities.User;
import com.example.springcourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "João", "joao@joao.com", "6599221477", "123123");
        User u2 = new User(null, "Carlos", "carlos@joao.com", "6598784512", "123123");
        User u3 = new User(null, "Manoel", "Manoel@joao.com", "6578451254", "123123");

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
    }
}
