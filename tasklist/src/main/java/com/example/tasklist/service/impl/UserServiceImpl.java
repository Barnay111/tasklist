package com.example.tasklist.service.impl;

import com.example.tasklist.repository.impl.UserRepositoryImpl;
import com.example.tasklist.repository.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {
    private final UserRepositoryImpl userRepository;
    private final UserMapper userMapper;
}
