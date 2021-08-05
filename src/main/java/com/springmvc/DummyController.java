package com.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DummyController {

    @RequestMapping("/showForm")

    public String show(){
        return "helloworld";
    }

}
