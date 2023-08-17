package com.example.GuestApp.mapper.inter;

import com.example.GuestApp.dto.LikeDTO;
import com.example.GuestApp.entities.Like;
import org.mapstruct.Mapper;

@Mapper
public interface LikeDTOMapper {
    public LikeDTO entityTo(Like like);
}
