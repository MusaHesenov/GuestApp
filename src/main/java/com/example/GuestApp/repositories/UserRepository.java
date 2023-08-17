package com.example.GuestApp.repositories;

import com.example.GuestApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository  extends JpaRepository<User, Long>{

}
