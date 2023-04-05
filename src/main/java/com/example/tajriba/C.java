package com.example.tajriba;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class C {

    @GetMapping()
    public String get(){
        return "ishladi";
    }
}
