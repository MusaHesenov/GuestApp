package com.example.GuestApp.controllers;

import com.example.GuestApp.entities.User;
import com.example.GuestApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> allUsers(){
        return (ResponseEntity<List<User>>) ResponseEntity.ok().body(userService.getAllUsers());
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.ok().body(userService.saveOnUser(user));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getOnUser(@PathVariable Long userId){
        return ResponseEntity.ok().body(userService.findUser(userId));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<User> update(@PathVariable Long userId, @RequestBody User user){
        return ResponseEntity.accepted().body(userService.updateUser(userId, user));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> delete(@PathVariable Long userId){
        return ResponseEntity.ok().body(userService.deleteUser(userId));
    }

}
