package com.ecommerce.service;

import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;

public class UserService {
//Manipula a classe repository

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User create(User user){
        return repository.create(user);
    }

    public boolean login (User user){
        User login = repository.findUserByEmail(user.getEmail());

            if(login.getPassword().equals(user.getPassword())){
                System.out.println("Login correto");
                return true;
            }
            System.out.println("senha incorreta");
            return false;
    }

}

// TODO 1 - addToCart ( product ) -> add to cart list
