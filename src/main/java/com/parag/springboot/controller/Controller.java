package com.parag.springboot.controller;

import com.parag.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.*;
import java.util.List;

@org.springframework.stereotype.Controller
@ComponentScan(basePackages = "com.parag.springboot")
public class Controller {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity userDetails() {

        List userDetail = userService.getUserdetails();
        return new ResponseEntity(userDetail, HttpStatus.OK);
    }

}
