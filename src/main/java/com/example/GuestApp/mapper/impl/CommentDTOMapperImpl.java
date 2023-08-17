package com.example.GuestApp.mapper.impl;

import com.example.GuestApp.dto.CommentDTO;
import com.example.GuestApp.entities.Comment;
import com.example.GuestApp.entities.Post;
import com.example.GuestApp.entities.User;
import com.example.GuestApp.mapper.inter.CommentDTOMapper;
import org.springframework.stereotype.Component;

@Component
public class CommentDTOMapperImpl implements CommentDTOMapper {
    @Override
    public Comment dtoTo(CommentDTO commentDTO, User user, Post post) {
        return Comment.builder()
                .id(commentDTO.getId())
                .text(commentDTO.getText())
                .post(post)
                .user(user)
                .build();
    }

    @Override
    public CommentDTO entityTo(Comment comment) {
        return CommentDTO.builder().id(comment.getId())
                .userId(comment.getUser().getId())
                .postId(comment.getPost().getId())
                .text(comment.getText())
                .build();
    }
}
