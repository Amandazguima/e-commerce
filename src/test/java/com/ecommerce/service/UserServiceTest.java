package com.ecommerce.service;

import com.ecommerce.fixture.UserFixture;
import com.ecommerce.model.User;

import com.ecommerce.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private final UserRepository userRepository = new UserRepository();
    private final UserService userService = new UserService(userRepository);

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

        boolean u = userService.login(user);

        assertTrue(u);
    }

    @Test
    void NotLogin(){
        User user = UserFixture.user();

        userService.create(UserFixture.user2());

        boolean u = userService.login(user);

        assertFalse(u);
    }


}