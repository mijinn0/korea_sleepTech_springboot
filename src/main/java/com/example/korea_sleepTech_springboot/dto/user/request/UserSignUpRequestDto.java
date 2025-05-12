package com.example.korea_sleepTech_springboot.dto.user.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSignUpRequestDto {
    @NotNull
    private String email;

    @NotNull
    private String password; // 비밀번호

    @NotNull
    private String confirmPassword; // 비밀번호 확인
}
