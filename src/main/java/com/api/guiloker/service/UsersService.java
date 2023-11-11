package com.api.guiloker.service;

import com.api.guiloker.dto.request.UsersRequestDto;
import com.api.guiloker.mapper.UsersMapper;
import com.api.guiloker.model.Users;
import com.api.guiloker.repository.UsersRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersService {

    private final UsersRepository usersRepository;
    private final UsersMapper usersMapper;

    public UsersService(UsersRepository usersRepository, UsersMapper usersMapper) {
        this.usersRepository = usersRepository;
        this.usersMapper = usersMapper;
    }

    @Transactional
    public ResponseEntity<Object> registerUser(UsersRequestDto dto) {
        Users lockerToSave = usersMapper.toModel(dto);
        usersRepository.save(lockerToSave);
        return ResponseEntity.status(HttpStatus.CREATED).body("success");
    }
}
