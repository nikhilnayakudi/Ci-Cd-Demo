package com.CI.CD.CICD.pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("u")
    public String gethello(){
        return "hello Nikhil,Iam Rohit from mumbai Indians vs Chennai super kings both are strong teams I think";
    }
}
