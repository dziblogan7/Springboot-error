package com.logan.curso.springboot.error.springboot_error.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/app")
    public String index(){

        //int value = 100/0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "ok 200";
    }

   // @GetMapping("/show{id}")

}
