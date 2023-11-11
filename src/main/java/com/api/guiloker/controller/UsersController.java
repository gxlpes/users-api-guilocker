package com.api.guiloker.controller;

import com.api.guiloker.dto.request.UsersRequestDto;
import com.api.guiloker.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping()
    public ResponseEntity<Object> registerUser(@Valid @RequestBody UsersRequestDto usersRequestDto) {
        return usersService.registerUser(usersRequestDto);
    }

}
