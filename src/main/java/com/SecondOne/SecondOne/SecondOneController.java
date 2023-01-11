package com.SecondOne.SecondOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SecondOneController {
    @Autowired SecondOneService Sand;

    @GetMapping("SecondOne/create/{sname}/{fname}/{school}/{age}")
    @ResponseBody
    public  String method(@PathVariable String sname,@PathVariable String fname,@PathVariable String age,@PathVariable String school)
    {
        SecondOne sec=new SecondOne();
        sec.setAge(age);
        sec.setFname(fname);
        sec.setSchool(school);
        sec.setSname(sname);
        Sand.AddsecondOne(sec);
        return  "user create";

    }

    @GetMapping("checkapi")
    @ResponseBody
    public ResponseEntity<String> check(){
        return new ResponseEntity<>("API is Working",HttpStatus.OK);
    }


    @GetMapping("SecondOne/get/{id}")
    @ResponseBody
    public  String findUser(@PathVariable int id) {
        System.out.println(id);
        return  Sand. getSecondOne( id);
    }

    @PostMapping(path = "users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SecondOne> create(@RequestBody SecondOneDTO newUser) {

        SecondOne user = new SecondOne();
        user.fname = newUser.fname;
        user.sname = newUser.sname;
        user.age = newUser.age;
        user.school = newUser.school;

        SecondOne addeduser = Sand.AddsecondOne(user);

        if (addeduser == null) {
            return new ResponseEntity<>(new SecondOne(), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(addeduser, HttpStatus.CREATED);
        }
    }

}
