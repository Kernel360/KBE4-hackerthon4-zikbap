package com.hackerthon.zikbap.user.dto;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private String token;
    private Long userId;
    private String email;
    private String nickname;
}
