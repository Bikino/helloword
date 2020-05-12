package com.hello_word.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWoldController {

    @GetMapping("/")
    public String index(){

        return "Hello Word from IET";
    }
}
