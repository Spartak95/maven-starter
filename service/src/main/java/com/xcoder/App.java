package com.xcoder;

import com.xcoder.service.UserService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.getUser(12L));
    }
}
