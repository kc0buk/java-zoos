package com.lambdaschool.zoos.controllers;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.services.ZooServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController {

    @Autowired
    ZooServices zooServices;

    @GetMapping(value = "/zoos", produces = {"application/json"})
    public ResponseEntity<?> findAllZoos() {
        List<Zoo> allZoosList = zooServices.findAllZoos();
        return new ResponseEntity<>(allZoosList, HttpStatus.OK);
    }
}
