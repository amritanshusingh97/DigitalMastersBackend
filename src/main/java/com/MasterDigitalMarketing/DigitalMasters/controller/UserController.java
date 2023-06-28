package com.MasterDigitalMarketing.DigitalMasters.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MasterDigitalMarketing.DigitalMasters.dto.UserDetailsDto;
import com.MasterDigitalMarketing.DigitalMasters.model.UserDetails;
import com.MasterDigitalMarketing.DigitalMasters.service.UserService;

@RestController
@RequestMapping("/api/user-details")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserDetails> registerUser(@RequestBody UserDetailsDto userDetailsDto) {
        // Validate userDetailsDto fields
        UserDetails userDetails = userService.registerUser(
                userDetailsDto.getEmail(),
                userDetailsDto.getPassword(),
                userDetailsDto.getContactNo()
        );
        return ResponseEntity.ok(userDetails);
    }

    @PostMapping("/login")
    public ResponseEntity<UserDetails> loginUser(@RequestBody UserDetailsDto userDetailsDto) {
        UserDetails userDetails = userService.loginUser(
                userDetailsDto.getEmail(),
                userDetailsDto.getPassword()
        );
        if (userDetails != null) {
            return ResponseEntity.ok(userDetails);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); // Login failed
    }
}
