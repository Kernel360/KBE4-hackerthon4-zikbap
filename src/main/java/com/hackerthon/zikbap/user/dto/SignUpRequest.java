package com.hackerthon.zikbap.user.dto;


import com.hackerthon.zikbap.user.enums.Gender;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
    private String email;
    private String password;
    private String nickname;
    private Gender gender;
    private Integer age;
}
