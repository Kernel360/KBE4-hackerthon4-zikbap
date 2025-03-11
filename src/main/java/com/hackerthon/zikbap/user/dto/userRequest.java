package com.hackerthon.zikbap.user.dto;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class userRequest {
    private String id;
    private String password;


}
