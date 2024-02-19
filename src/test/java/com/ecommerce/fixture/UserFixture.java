package com.ecommerce.fixture;

import com.ecommerce.model.User;

import java.time.LocalDate;
import java.util.Date;

public class UserFixture {

    public static User user(){
        return  new User("Amanda", LocalDate.of(1999, 5, 13),"019.880.596-90","amandazguima2@gmail.com","01234567","01");
    }

    public static User user2(){
        return  new User("Amanda", LocalDate.of(1999, 5, 13),"019.880.596-90","amandazguima2@gmail.com","01234567","02");
    }
}
