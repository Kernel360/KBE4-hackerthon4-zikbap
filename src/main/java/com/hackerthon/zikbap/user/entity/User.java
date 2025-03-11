package com.hackerthon.zikbap.user.entity;

import java.time.LocalDateTime;

import com.hackerthon.zikbap.user.enums.Gender;
import com.hackerthon.zikbap.user.enums.Role;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@ToString
@Table(name="users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId; // PK, AI, BIGINT

    @Column(name = "email", nullable = false, length = 320, unique = true)
    private String email; // VARCHAR(320), NOT NULL, UK

    @Column(name = "password", nullable = false, length = 255)
    private String password; // VARCHAR(255), NOT NULL

    @Column(name = "nickname", nullable = false, length = 8, unique = true)
    private String nickname; // VARCHAR(5), NOT NULL, UK

    // 성별 Enum('M','F')
    @Enumerated(EnumType.STRING)
    @Column(name = "gender", length = 1)
    private Gender gender;

    // 나이대 TINYINT
    @Column(name = "age")
    private Integer age;

    // 권한 Enum('admin','owner','user')
    @Enumerated(EnumType.STRING)
    @Column(name = "role", length = 10)
    private Role role;

    // 생성일, DATETIME
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    // 수정일, DATETIME
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // 삭제일, DATETIME
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    // 삭제 여부, TINYINT(1)
    @Column(name = "deleted")
    private Boolean deleted;
}
