package com.example.GuestApp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostsDTO {
    private Long id;
    private Long userId;
    private String userName;
    private String title;
    private String text;
    private List<LikeDTO> likes;
}
