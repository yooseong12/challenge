package com.example.challenge.controller;

import com.example.challenge.model.request.UserRequest;
import com.example.challenge.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping("/joinForm")
    public String joinView() {
        return "user/joinForm";
    }

    @GetMapping("/loginForm")
    public String loginView() {
        return "user/loginForm";
    }



    @PostMapping("/join")
    public String join(UserRequest.Join request) {
        userService.join(request);
        return "redirect:/loginForm";
    }

    //todo: 로그인 기능 구현
    @PostMapping("/login")
    public String login(UserRequest.Login request) {
        //userService.login(request);
        return "redirect:/index";
    }
}
