package com.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Democountroller {

    @RequestMapping("SELECT")
    public  String select(){
        return "index";
    }
}
