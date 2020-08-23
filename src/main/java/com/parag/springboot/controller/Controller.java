package com.parag.springboot.controller;

import com.parag.springboot.domainobject.RequestUserDetailsDom;
import com.parag.springboot.mapper.Objectmapper;
import com.parag.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@org.springframework.stereotype.Controller
@ComponentScan(basePackages = "com.parag.springboot")
public class Controller {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity userDetails() {


        return new ResponseEntity(new Objectmapper().mappEntityToDom(userService.getUserdetails()), HttpStatus.OK);
    }

    @PostMapping("/upsert")
    @ResponseBody
    public ResponseEntity userDetails(@RequestBody RequestUserDetailsDom requestUserDetailsDom) {
        return new ResponseEntity(userService.upsert(new Objectmapper().mappDOMtoEntity(requestUserDetailsDom)),HttpStatus.OK);

    }

    @RequestMapping("/securedPage")
    public String securePage(Model model, Principal principal){
        return "securedPage";


    }
    @RequestMapping("/")
    public String index(Model model, Principal principal) {
        return "index";
    }



}
