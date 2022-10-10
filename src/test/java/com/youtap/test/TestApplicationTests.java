package com.youtap.test;

import com.youtap.test.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Autowired
    private UserController userController;

    @Test
    void testUser() {

    }


}
