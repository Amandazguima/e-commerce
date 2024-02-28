package com.ecommerce.repository;

import com.ecommerce.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class UserRepository {

    public Map<String, User> userMap = new HashMap<>();

    public User create(User user) {
        return userMap.put(user.getId(), user);

    }

    public User findUserByEmail(String email) {
        User userLogin = null;
        List<User> users = userMap.values().stream().toList();

        for (User u : users) {
            if (u.getEmail().equals(email)) {
                userLogin = u;
            }
        }
        return userLogin;
    }
}
