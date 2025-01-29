package com.microservice.axis.Controller;

import com.microservice.axis.UserModel.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    // GET request to show login page
    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Returns login.html (Thymeleaf template)
    }

    // POST request for login authentication
    @PostMapping("/login")
    public String loginUser(String username, String password, Model model) {
        // Mock user credentials for demonstration (you can integrate with a database)
        String validUsername = "user";
        String validPassword = "password";

        if (username.equals(validUsername) && password.equals(validPassword)) {
            // Successful login, redirect to home or dashboard
            return "redirect:/"; // Assuming home page is the next step after successful login
        } else {
            // Failed login, return to login page with error
            model.addAttribute("error", true);
            return "login"; // Returns login.html again with an error message
        }
    }
}