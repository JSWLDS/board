package com.example.board.domain.api;

import com.example.board.domain.application.BoradService;
import com.example.board.domain.dto.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequiredArgsConstructor
class BoardController {

    private final BoradService boradService;


    @GetMapping("/index")
    public String showIndex() {


        return "index";
    }

    @GetMapping("/home")
    public String showHome(Model model) {

        List<Member> memberList = boradService.findMemberArgs();
        model.addAttribute("memberList", memberList);

        return "home";
    }


    @GetMapping("/insert")
    public String showInsert(@ModelAttribute("member") Member member, Model model) {

        return "memberc/insert";
    }


    @PostMapping("/create")
    public String createMember(@Validated Member member,  BindingResult bindingResult, Model model){

        boradService.createMember(member);

        if (bindingResult.hasErrors()) {
            return "memberc/insert";
        }


        return "home";
    }


}
