package com.springboot.Security.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {


    @GetMapping("/hello")
    public String greet(){

        return "Hello";
    }

    @GetMapping("/doctor")
    public String doctor(){

        return "Hello Doctor";
    }

    @GetMapping("/ceo")
    public String ceo(){

        return "Hello ceo";
    }

    @GetMapping("/deo")
    public String deo(){

        return "Hello deo";
    }

    @GetMapping("/schedule")
    public String schedule(){

        return "Your appointment has been scheduled!";
    }

}
