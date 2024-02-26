package com.dongli.todo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("login")
    public String goToLoginPage() {
        return "login";
    }

    @PostMapping("login")
    public String goToLoginPage(
            @RequestParam String name,
            @RequestParam String password,
            ModelMap modelMap) {
        if (authenticationService.authenticate(name, password)) {
            modelMap.put("name", name);
            return "welcome";
        }
        modelMap.put("errorMessage", "Invalid Credentials.");
        return "login";
    }
}
