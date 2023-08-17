package com.example.GuestApp.services;

import com.example.GuestApp.entities.User;
import com.example.GuestApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User saveOnUser(User user){
        return userRepository.save(user);
    }

    public User findUser(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public String deleteUser(Long userId){
        userRepository.deleteById(userId);
        return "Succesfully deleted";
    }

    public User updateUser(Long userId, User user){
        User user1 = userRepository.findById(userId).orElse(null);
        user1.setUserName(user.getUserName());
        user1.setPassword(user.getPassword());
        return userRepository.save(user1);
    }





}
