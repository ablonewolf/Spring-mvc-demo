package com.arka99.Springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class FormController {
//    need a controller method to initiate the form view
    @RequestMapping(value = "/springmvcdemo/userform")
    public String showForm() {
        return "userform";
    }
//    need a controller method to process the form data
    @RequestMapping(value = "/data",method = RequestMethod.POST)
    public String processForm(HttpSession session, @RequestParam String username, @RequestParam String useremail) {
        session.setAttribute("name",username);
        session.setAttribute("email",useremail);
        return "viewdata";

    }
}
