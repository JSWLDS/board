package com.example.board.domain.api;

import com.example.board.domain.dao.UserRepository;
import com.example.board.domain.dto.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequiredArgsConstructor
class BoardController {

    private final UserRepository userRepository;


    @GetMapping("/index")
    public String showIndex() {


        return "index";
    }

    @GetMapping("/home")
    public String showHome(Model model) {
        List<Member> nameList = userRepository.findAll();
        model.addAttribute("nameList", nameList);

        return "home";
    }



}
