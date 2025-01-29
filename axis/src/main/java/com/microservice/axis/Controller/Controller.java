package com.microservice.axis.Controller;

import com.microservice.axis.Model.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    // POST API to create a new user
    @PostMapping("/users")
    public String createUser(@RequestBody Model user) {
        // Simulate saving the user data
        // For now, just return a success message
        return "User " + user.getName() + " created successfully!";
    }
    @GetMapping("info")
    public String hello(@RequestBody Model user) {
        return "Hello, " + user.getName();
    }
}
