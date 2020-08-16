package com.parag.springboot.controller;

import com.parag.springboot.domainobject.UserDetailsDom;
import com.parag.springboot.mapper.Objectmapper;
import com.parag.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@org.springframework.stereotype.Controller
@ComponentScan(basePackages = "com.parag.springboot")
public class Controller {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity userDetails() {

        List userDetail = userService.getUserdetails();
        return new ResponseEntity(userDetail, HttpStatus.OK);
    }

    @PostMapping("/list/upsert")
    @ResponseBody
    public ResponseEntity userDetails(@RequestBody UserDetailsDom userDetailsDom) {
        return new ResponseEntity(userService.upsert(new Objectmapper().mappDOMtoEntity(userDetailsDom)),HttpStatus.OK);

    }

}
