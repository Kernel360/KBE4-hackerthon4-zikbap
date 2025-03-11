package com.hackerthon.zikbap.user.controller;

// userController.java
import com.hackerthon.zikbap.user.dto.userRequest;
import com.hackerthon.zikbap.user.dto.userResponse;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class userController {

    // 실제 서비스에서는 안전하게 관리할 것
    private static final String SECRET_KEY = "your_secret_key";

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody userRequest userRequest, HttpServletResponse response) {
        Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
        // 예시: 고정된 id와 password로 검증
        if ("correctId".equals(userRequest.getId()) && "correctPassword".equals(userRequest.getPassword())) {
            // 토큰 생성 (만료시간 1시간)
            String token = Jwts.builder()
                    .setSubject(userRequest.getId())
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000)) // 1시간 후 만료
                    .signWith(key, SignatureAlgorithm.HS256)
                    .compact();

            // JWT 토큰을 쿠키에 저장 (HTTP only 속성 설정)
            Cookie cookie = new Cookie("jwt", token);
            cookie.setHttpOnly(true);  // 클라이언트 측의 스크립트에서 쿠키에 접근할 수 없도록 설정
            cookie.setPath("/");       // 쿠키를 모든 경로에서 사용 가능하게 설정
            cookie.setMaxAge(3600);    // 1시간 동안 쿠키 유지

            response.addCookie(cookie);
            return ResponseEntity.ok(new userResponse(token));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}

