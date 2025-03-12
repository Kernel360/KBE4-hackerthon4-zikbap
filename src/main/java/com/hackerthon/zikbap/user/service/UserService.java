package com.hackerthon.zikbap.user.service;

import com.hackerthon.zikbap.global.filter.JwtUtil;
import com.hackerthon.zikbap.user.dto.SignUpRequest;
import com.hackerthon.zikbap.user.dto.SignUpResult;
import com.hackerthon.zikbap.user.dto.UserRequest;
import com.hackerthon.zikbap.user.entity.User;
import com.hackerthon.zikbap.user.enums.Role;
import com.hackerthon.zikbap.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final JwtUtil jwtUtil;
    private final UserRepository userRepository;

    @Transactional
    public SignUpResult signUp(SignUpRequest request) {
        User newUser = User.builder()
                .email(request.getEmail())
                .password(request.getPassword())
                .nickname(request.getNickname())
                .gender(request.getGender())
                .age(request.getAge())
                .role(Role.user)
                .createdAt(LocalDateTime.now())
                .modifiedAt(null)
                .deletedAt(null)
                .deleted(false)
                .build();
        userRepository.save(newUser);
        return SignUpResult.builder()
                .userId(newUser.getUserId())
                .nickname(newUser.getNickname())
                .build();
    }

    //TODO: 예외처리 및 예외 메시지 분리
    @Transactional
    public String logIn(UserRequest request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 사용자입니다."));


        if (!request.getPassword().equals(user.getPassword())) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        String accessToken  = jwtUtil.generateToken(request.getEmail());
        return accessToken;
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}

