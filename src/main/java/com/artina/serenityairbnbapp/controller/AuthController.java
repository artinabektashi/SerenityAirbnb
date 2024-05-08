package com.artina.serenityairbnbapp.controller;

import com.artina.serenityairbnbapp.exception.UserAlreadyExistsException;
import com.artina.serenityairbnbapp.model.User;
import com.artina.serenityairbnbapp.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
public class AuthController {

    private final IUserService userService;

    @PostMapping("/register-user")
    public ResponseEntity<?> registerUser(User user){
        try{
            userService.registerUser(user);
            return ResponseEntity.ok("Registration was successful!");
        }catch(UserAlreadyExistsException e){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

}
