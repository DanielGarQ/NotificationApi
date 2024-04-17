package com.notificationapi.notificationapi.controller;

import com.notificationapi.notificationapi.auth.AuthResponse;
import com.notificationapi.notificationapi.auth.AuthService;
import com.notificationapi.notificationapi.auth.LoginRequest;
import com.notificationapi.notificationapi.auth.RegisterRequest;
import com.notificationapi.notificationapi.entity.PersonaEntity;
import com.notificationapi.notificationapi.entity.UsuarioEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {


    @Autowired
    private AuthService authService;

    @PostMapping(value = "/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(authService.register(request));
    }
}