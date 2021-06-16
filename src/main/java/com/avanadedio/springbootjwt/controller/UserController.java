package com.avanadedio.springbootjwt.controller;


import com.avanadedio.springbootjwt.data.UserData;
import com.avanadedio.springbootjwt.service.UserDetailServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserDetailServiceImpl userDetailsService;

    public UserController(UserDetailServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @RequestMapping("/all-users")
    public List<UserData> listAllUsers() {
        return userDetailsService.listUsers();
    }

}

