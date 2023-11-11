package com.api.guiloker.mapper;

import com.api.guiloker.dto.request.UsersRequestDto;
import com.api.guiloker.model.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersMapper {

    public static Users toModel(UsersRequestDto requestDto) {
        Users users = new Users();
        users.setStudentEmail(requestDto.getStudentEmail());
        users.setGrr(requestDto.getGrr());
        users.setFullName(requestDto.getFullName());
        users.setBirthdate(requestDto.getBirthdate());
        return users;
    }
}
