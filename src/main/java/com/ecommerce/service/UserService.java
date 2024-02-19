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
        User dbUser = repository.login(user);
        if(dbUser != null && dbUser.getEmail().equals(user.getEmail())){
            if(dbUser.getPassword().equals(user.getPassword())){
                System.out.println("Login correto");
                return true;
            }
            System.out.println("senha incorreta");
            return false;
        }
        System.out.println("Email não existe ou incorreto");
        return false;
    }


}
