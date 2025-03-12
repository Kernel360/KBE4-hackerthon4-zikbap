package com.hackerthon.zikbap.user.dto;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpResult {
    private Long userId;
    private String nickname;
}
