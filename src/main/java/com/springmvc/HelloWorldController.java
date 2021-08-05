package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormUppercase")
    public String processFormUppercase(HttpServletRequest request, Model model) {

        String givenName = request.getParameter("studentName");
        model.addAttribute("updatedName", givenName.toUpperCase());

        return "helloworldUppercase";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String givenName, Model model) {

        model.addAttribute("updatedName", "Version 3: " + givenName.toUpperCase());

        return "helloworldUppercase";
    }
}
