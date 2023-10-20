package com.microservice.user.services;

import com.microservice.user.models.UserModel;
import com.microservice.user.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserModel create(UserModel userModel) {
        return userRepository.save(userModel);
    }
}
