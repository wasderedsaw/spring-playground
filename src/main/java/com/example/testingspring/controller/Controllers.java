package com.example.testingspring.controller;

import com.example.testingspring.entity.User;
import com.example.testingspring.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@Controller
@AllArgsConstructor
public class Controllers {

    private final UserRepository userRepository;

    @PostMapping("/create_user")
    public String createUser(Model model) {
        User user = new User();
        user.setEmail((String) model.getAttribute("email"));
        user.setPassword((String) model.getAttribute("password"));
        user.setUsername((String) model.getAttribute("username"));
        user.setFridges(new HashSet<>());
        userRepository.save(user);
        return "index";
    }


    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

}
