package com.example.challenge.service;

import com.example.challenge.domain.User;
import com.example.challenge.model.request.UserRequest;
import com.example.challenge.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void join(UserRequest.Join request) {
        userRepository.save(request.toEntity());
    }



}
