package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.UserInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody UserInfo userInfo){
        return "Hello" + userInfo.getFirstName() + " " + userInfo.getLastName() + "!";
    }

    @PutMapping("/put/{firstName}/{lastName}")
    public String sayHello(@PathVariable String firstName, @PathVariable String lastName){
        return "Hello " + firstName + " " + lastName;
    }

}
