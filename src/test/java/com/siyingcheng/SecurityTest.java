/*
 * Copyright © 2022-2022 siyingcheng@126.com, All Rights Reserved.
 */

package com.siyingcheng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
public class SecurityTest {

    @Value("${spring.security.user.password}")
    private String password;

    @Test
    public void testPasswordEncode() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        Assertions.assertTrue(encoder.matches("Owen1988", password));
    }
}
