package com.example.korea_sleepTech_springboot.dto.response;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
public class PostListResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
}
