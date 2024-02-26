package com.dongli.todo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {

        boolean isValidUserName = username.equals("dongli");
        boolean isValidPassword = password.equals("1234");

        return isValidUserName && isValidPassword;
    }
}
