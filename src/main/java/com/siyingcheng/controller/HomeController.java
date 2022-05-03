/*
 * Copyright © 2022-2022 siyingcheng@126.com, All Rights Reserved.
 */

package com.siyingcheng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Hello";
    }
}
