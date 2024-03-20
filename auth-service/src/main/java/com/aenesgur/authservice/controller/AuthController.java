package com.aenesgur.authservice.controller;

import com.aenesgur.authservice.model.AuthRequest;
import com.aenesgur.authservice.model.AuthResponse;
import com.aenesgur.authservice.service.AuthService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    private static final String AUTHORIZATION_HEADER = "Authorization";

    @PostMapping(value = "/register")
    public ResponseEntity<AuthResponse> register(@RequestBody AuthRequest authRequest) {
        return ResponseEntity.ok(authService.register(authRequest));
    }

    @GetMapping(value = "/infor")
    public ResponseEntity<?> infor(@RequestHeader(AUTHORIZATION_HEADER) String token) {

        return ResponseEntity.ok(authService.infor(token== null? "": token));
    }
}
