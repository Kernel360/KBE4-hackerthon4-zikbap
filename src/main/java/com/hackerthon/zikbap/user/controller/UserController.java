package com.hackerthon.zikbap.user.controller;

// userController.java
import com.hackerthon.zikbap.user.dto.SignUpRequest;
import com.hackerthon.zikbap.user.dto.SignUpResult;
import com.hackerthon.zikbap.user.dto.UserRequest;
import com.hackerthon.zikbap.user.dto.UserResponse;
import com.hackerthon.zikbap.user.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody SignUpRequest request) {

        if (userService.findByEmail(request.getEmail()).isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        SignUpResult signUpResult=userService.signUp(request);
        log.info("post요청");
        return ResponseEntity.status(HttpStatus.CREATED).body(signUpResult);
    }

    @PostMapping("/login")
    public ResponseEntity<?> logIn(@RequestBody UserRequest request, HttpServletResponse response) {
        UserResponse userResponse = userService.logIn(request);
        Cookie cookie = new Cookie("jwt", userResponse.getToken());
        cookie.setHttpOnly(true);  // 클라이언트 측의 스크립트에서 쿠키에 접근할 수 없도록 설정
        cookie.setPath("/");       // 쿠키를 모든 경로에서 사용 가능하게 설정
        cookie.setMaxAge(3600);    // 1시간 동안 쿠키 유지
        response.addCookie(cookie);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
    }

    @PostMapping("/logout")
    public void logout(HttpServletResponse response) {
        Cookie cookie = new Cookie("jwt", null);
        cookie.setMaxAge(0);
        cookie.setPath("/");
        response.addCookie(cookie);
    }
}

