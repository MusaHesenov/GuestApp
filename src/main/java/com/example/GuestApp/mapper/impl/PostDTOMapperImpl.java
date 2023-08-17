package com.example.GuestApp.mapper.impl;

import com.example.GuestApp.dto.LikeDTO;
import com.example.GuestApp.dto.PostDTO;
import com.example.GuestApp.dto.PostsDTO;
import com.example.GuestApp.entities.Post;
import com.example.GuestApp.entities.User;
import com.example.GuestApp.mapper.inter.PostDTOMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostDTOMapperImpl implements PostDTOMapper {

    @Override
    public Post dtoTo(PostDTO postDTO, User user) {
        return Post.builder()
                .text(postDTO.getText())//SUAL
                .id(postDTO.getId())
                .title(postDTO.getTitle())
                .user(user).build();
    }

    @Override
    public PostsDTO entityTo(Post post, List<LikeDTO> likeList) {
        return PostsDTO.builder()
                .id(post.getId())
                .userId(post.getUser().getId())
                .userName(post.getUser().getUserName())
                .text(post.getText())
                .likes(likeList)
                .build();
    }
}
