package com.projet.springsecurity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by macbookpro on 10/24/18.
 */

@RestController
@RequestMapping("/classe")
public class ClassController {

    @GetMapping
    public ResponseEntity<String> Hello(){

        return  new ResponseEntity<String>("Hello world", HttpStatus.OK);
    }
}
