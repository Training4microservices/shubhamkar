package com.traning.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
class myController {
    @GetMapping(value = "/name")
    public String getName(){
        return "shubhamkar thavi";
    }
    @GetMapping(value = "/name/{hobby}")
    public String getHobby(@PathVariable("hobby") String hobby){
        return "My hobby is "+hobby;
    }


}