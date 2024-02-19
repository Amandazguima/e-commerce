package com.ecommerce.repository;

import com.ecommerce.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    public Map<String,User> userMap = new HashMap<>();

    public User create(User user){
       return userMap.put(user.getId(),user);

    }

    public User login (User user){
        return userMap.get(user.getEmail());
    }



}
