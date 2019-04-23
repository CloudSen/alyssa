package com.umbrella.alyssa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CloudSen
 */
@Controller
@RequestMapping("/index")
public class HomeCtl {

    @GetMapping("")
    public String goIndex() {
        return "index";
    }
}
