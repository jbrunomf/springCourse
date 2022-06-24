package com.example.springcourse.resources;

import com.example.springcourse.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "João", "joao@teste.com", "6599222299", "10203040");
        return ResponseEntity.status(HttpStatus.OK).body(u);
    }
}
