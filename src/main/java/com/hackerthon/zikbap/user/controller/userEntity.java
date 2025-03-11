package com.hackerthon.zikbap.user.controller;

import java.time.LocalDateTime;

import com.hackerthon.zikbap.user.controller.enums.gender;
import com.hackerthon.zikbap.user.controller.enums.role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


public class userEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id; // PK, AI, BIGINT

    @Column(name = "email", nullable = false, length = 320, unique = true)
    @NotNull
    private String email; // VARCHAR(320), NOT NULL, UK

    @Column(name = "password", nullable = false, length = 255)
    @NotNull
    private String password; // VARCHAR(255), NOT NULL

    @Column(name = "nickname", nullable = false, length = 5, unique = true)
    @NotNull
    private String nickname; // VARCHAR(5), NOT NULL, UK

    // 성별 Enum('M','F')
    @Enumerated(EnumType.STRING)
    @Column(name = "gender", length = 1)
    @NotNull
    private gender gender;

    // 나이대 TINYINT
    @Column(name = "age_range")
    @NotNull
    private Integer ageRange;

    // 권한 Enum('admin','owner','user')
    @Enumerated(EnumType.STRING)
    @Column(name = "role", length = 10)
    @NotNull
    private role role;

    // 생성일, DATETIME
    @Column(name = "created_at", updatable = false)
    @NotNull
    private LocalDateTime createdAt;

    // 수정일, DATETIME
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // 삭제일, DATETIME
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    // 삭제 여부, TINYINT(1)
    @Column(name = "is_deleted")
    @NotNull
    private Boolean isDeleted;
}
