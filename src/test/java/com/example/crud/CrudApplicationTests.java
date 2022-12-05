package com.example.crud;

import com.example.crud.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class CrudApplicationTests {

    @Test
    void contextLoads() {
        ArrayList<User> user= new ArrayList<>();
        user.add(new User("min","jun","1234"));
    }

}
