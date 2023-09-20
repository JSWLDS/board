package com.example.board.controller;

import com.example.board.repository.UserRepository;
import com.example.board.table.User;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
class Controller {

    private final UserRepository userRepository;


    @GetMapping("/index")
    public String showIndex() {


        return "index";
    }

    @GetMapping("/home")
    public String showHome(Model model) {
        List<User> nameList = userRepository.findAll();
        model.addAttribute("nameList", nameList);

        return "home";
    }



}
