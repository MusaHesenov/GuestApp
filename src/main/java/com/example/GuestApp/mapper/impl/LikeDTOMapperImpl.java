package com.example.GuestApp.mapper.impl;

import com.example.GuestApp.dto.LikeDTO;
import com.example.GuestApp.entities.Like;
import com.example.GuestApp.mapper.inter.LikeDTOMapper;

public class LikeDTOMapperImpl implements LikeDTOMapper {
    @Override
    public LikeDTO entityTo(Like like) {
        return LikeDTO.builder()
                .postId(like.getPost().getId().longValue())
                .userId(like.getUser().getId().longValue())
                .build();
    }
}
