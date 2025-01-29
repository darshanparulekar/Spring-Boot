package com.microservice.axis.Controller;

import com.microservice.axis.UserModel.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.web.bind.annotation.*;

@RestController  // Ensure this is @RestController and not @Controller or any other annotation
@RequestMapping("/api")
public class ApiController {

    private UserModel model;

    // POST endpoint to receive user details
    @PostMapping("/users")
    public String createUser(@RequestBody UserModel model) {
        this.model = model;  // Save the model data
        return "User " + model.getName() + " with email " + model.getEmail() + " has been created.";
    }

    // GET endpoint to show user details
    @GetMapping("/users")
    public UserModel getUser() {
        return model;  // Return the model data as a JSON response
    }

    // GET endpoint to display health status
    @Autowired
    private HealthEndpoint healthEndpoint;

    @GetMapping("/health")
    public Object getHealth() {
        // Returns health information in JSON format
        return healthEndpoint.health();
    }

    // GET endpoint to greet the user
    @GetMapping("/info")
    public String hello(@RequestParam String name) {
        return "Hello, " + name;
    }
}