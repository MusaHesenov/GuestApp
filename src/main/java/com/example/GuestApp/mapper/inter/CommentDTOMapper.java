package com.example.GuestApp.mapper.inter;

import com.example.GuestApp.dto.CommentDTO;
import com.example.GuestApp.entities.Comment;
import com.example.GuestApp.entities.Post;
import com.example.GuestApp.entities.User;
import org.mapstruct.Mapper;

@Mapper
public interface CommentDTOMapper {
    public Comment dtoTo(CommentDTO commentDTO, User user, Post post);
    public CommentDTO entityTo(Comment comment);
}
