package com.MasterDigitalMarketing.DigitalMasters.service;

import org.springframework.stereotype.Service;

import com.MasterDigitalMarketing.DigitalMasters.model.UserDetails;
import com.MasterDigitalMarketing.DigitalMasters.repository.UserDetailsRepository;

@Service
public class UserService {

    private UserDetailsRepository userDetailsRepository;

    public UserService(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    public UserDetails registerUser(String email, String password, String contactNo) {
        UserDetails userDetails = new UserDetails();
        userDetails.setEmail(email);
        userDetails.setPassword(password);
        userDetails.setContactNo(contactNo);
        // Additional user registration logic

        return userDetailsRepository.save(userDetails);
    }

    public UserDetails loginUser(String email, String password) {
        UserDetails userDetails = userDetailsRepository.findByEmail(email);
        if (userDetails != null && userDetails.getPassword().equals(password)) {
            // Additional login logic
            return userDetails;
        }
        return null; // Login failed
    }
}

