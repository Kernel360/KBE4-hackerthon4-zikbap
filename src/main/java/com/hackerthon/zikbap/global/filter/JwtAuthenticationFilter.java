package com.hackerthon.zikbap.global.filter;

import com.hackerthon.zikbap.global.filter.JwtUtil;
import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import java.io.IOException;
@Slf4j
@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends GenericFilterBean {
    private final JwtUtil jwtUtil;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        String requestUri = httpRequest.getRequestURI();

        // 로그인 및 회원가입 요청은 필터를 거치지 않도록 예외 처리
        if (true || requestUri.startsWith("/api/login") || requestUri.startsWith("/api/signup")) {
            log.info("Filter예외처리");
            chain.doFilter(request, response);
            return;
        }

        // JWT 쿠키 가져오기
        String token = getJwtFromCookies(httpRequest);
        if (token == null || jwtUtil.validateToken(token) == null) {
            httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "유효하지 않은 토큰입니다.");
            return;
        }
        // 토큰에서 이메일(또는 사용자 정보) 가져오기
        Claims claims = jwtUtil.getClaims(token);
        String email = claims.getSubject();

        // JWT가 정상적으로 검증되면, 다음 필터로 요청 전달
        request.setAttribute("email", email);
        chain.doFilter(request, response);
    }

    private String getJwtFromCookies(HttpServletRequest request) {
        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                if ("jwt".equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}
