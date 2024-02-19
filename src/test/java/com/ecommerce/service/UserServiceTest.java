package com.ecommerce.service;

import com.ecommerce.fixture.UserFixture;
import com.ecommerce.model.User;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ecommerce.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserServiceTest {

    private UserRepository userRepository = new UserRepository();
     private UserService userService = new UserService(userRepository);

    @Test
    @DisplayName("should create a user")
    void create() {
        User user = UserFixture.user();

        userService.create(user);

        assertEquals(user,userRepository.userMap.get(user.getId()));
    }

    @Test
    void login(){
        User user = UserFixture.user();
        userService.create(user);
        userService.login(user);
        assertEquals(user,userRepository.userMap.get(user.getEmail()));
    }
}