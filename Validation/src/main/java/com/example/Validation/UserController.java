package com.example.Validation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/user")
    public List<User> getAllUser() {
        return List.of(new User(231501, "Uttarpradesh", "Mirzapur", "India"));
    }
}
