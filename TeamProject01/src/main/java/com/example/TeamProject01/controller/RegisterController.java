package com.example.TeamProject01.controller;

import com.example.TeamProject01.Domain.Member;
import com.example.TeamProject01.service.MemberService;
import com.fasterxml.jackson.core.io.JsonStringEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;

@RestController
@RequestMapping(value = "/register")
public class RegisterController {
    Logger logger = LoggerFactory.getLogger(RegisterController.class);
    @Autowired
    MemberService service;

    @Autowired
    public RegisterController(MemberService service) {
        this.service = service;
    }

    @PostMapping("")
    public Member create(@RequestBody Member m) throws ParseException {
        service.save(m);

        return m;
        //return "redirect:/";
    }

    @ResponseBody
    @GetMapping("/idcheck")
    public int idchecked(@RequestParam("id") String id){
        int data = service.idCheck(id);
        return data;
    }

    @ResponseBody
    @GetMapping("/nicknameCheck")
    public int nicknameCheck(@RequestParam("nickname") String n_name) {
        int data = service.nicknameCheck(n_name);
        return data;
    }

    @ResponseBody
    @GetMapping("/mailCheck")
    public int emailCheck(@RequestParam("mail") String email) {
        int data = service.emailCheck(email);
        return data;
    }

}
