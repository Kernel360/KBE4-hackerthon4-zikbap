package com.hackerthon.zikbap.user.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String email;
    private String password;
}
