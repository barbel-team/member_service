package com.example.TeamProject01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(HttpServletRequest request, Model model) {
        return "index";
    }

    @GetMapping("/myCart")
    public String cart(HttpServletRequest request, Model model) {
        return "/myPage/myCart";
    }

    @GetMapping("/myOrder")
    public String order(HttpServletRequest request, Model model) {
        return "/myPage/myOrder";
    }

    @GetMapping("/myLike")
    public String like(HttpServletRequest request, Model model) {
        return "/myPage/myLike";
    }


    @GetMapping("/myInquiry")
    public String inquiry(HttpServletRequest request, Model model) {
        return "/myPage/myInquiry";
    }

    @GetMapping("/myReview")
    public String review(HttpServletRequest request, Model model) {
        return "/myPage/myReview";
    }
}
