package com.hackerthon.zikbap.user.dto;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Long userId;
    private String token;
    private String email;
    private String nickname;
}
