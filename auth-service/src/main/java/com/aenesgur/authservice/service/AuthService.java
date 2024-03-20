package com.aenesgur.authservice.service;
import com.aenesgur.authservice.model.AuthRequest;
import com.aenesgur.authservice.model.AuthResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final JwtService jwtService;

    public AuthResponse register(AuthRequest authRequest) {
        String accessToken = jwtService.generate(authRequest.getEmail(), "ACCESS");
        String refreshToken = jwtService.generate(authRequest.getEmail(), "REFRESH");

        return new AuthResponse(accessToken, refreshToken);
    }

    public Object infor(String token){
        token= token.replace("Bearer ", "");
        return jwtService.getAllClaimsFromToken(token);
    }
}
