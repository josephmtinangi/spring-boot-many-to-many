package com.josephmtinangi.springbootmanytomany.controllers;

import com.josephmtinangi.springbootmanytomany.utilities.Helper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class WelcomeController {

    @RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseEntity<?> index() {

        return Helper.createResponse(Helper.createMessage("Welcome"), HttpStatus.OK);
    }
}
