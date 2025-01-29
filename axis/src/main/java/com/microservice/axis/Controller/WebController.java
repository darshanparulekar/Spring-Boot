package com.microservice.axis.Controller;

import com.microservice.axis.UserModel.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class WebController {

    @GetMapping("/")
    public String homePage(Model model) {
        // Add an empty user object to the model
        model.addAttribute("user", new UserModel());
        return "user-form";  // Return the view name (Thymeleaf template)
    }

    @PostMapping("/submit-form")
    public String submitForm(@ModelAttribute("user") UserModel user, Model model) {
        // Handle form submission
        model.addAttribute("message", "User " + user.getName() + " with email " + user.getEmail() + " has been created.");
        return "result"; // Redirect to a result page or return view name
    }
}