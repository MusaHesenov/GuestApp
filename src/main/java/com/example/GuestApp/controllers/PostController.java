package com.example.GuestApp.controllers;

import com.example.GuestApp.repositories.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class PostController {
    private UserRepository userRepository;


}
