package com.example.GuestApp.repositories;

import com.example.GuestApp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
