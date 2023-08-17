package com.example.GuestApp.mapper.inter;

import com.example.GuestApp.dto.LikeDTO;
import com.example.GuestApp.dto.PostDTO;
import com.example.GuestApp.dto.PostsDTO;
import com.example.GuestApp.entities.Post;
import com.example.GuestApp.entities.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PostDTOMapper {
    public Post dtoTo(PostDTO postDTO, User user);
    public PostsDTO entityTo(Post post, List<LikeDTO> likeList);
}
