package com.example.korea_sleepTech_springboot.service;

import com.example.korea_sleepTech_springboot.dto.request.PostCreateRequestDto;
import com.example.korea_sleepTech_springboot.dto.request.PostUpdateRequestDto;
import com.example.korea_sleepTech_springboot.dto.response.PostDetailResponseDto;
import com.example.korea_sleepTech_springboot.dto.response.PostListResponseDto;
import com.example.korea_sleepTech_springboot.dto.response.ResponseDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface PostService {
    public ResponseDto<PostDetailResponseDto> createPost(@Valid PostCreateRequestDto dto);
    public ResponseDto<PostDetailResponseDto> getPostById(Long id);
    public ResponseDto<List<PostListResponseDto>> getAllPosts();
    public ResponseDto<PostDetailResponseDto> updatePost(Long id, @Valid PostUpdateRequestDto dto);
    public ResponseDto<Void> deletePost(Long id);
}
