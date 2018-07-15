package com.cd.bootdemo;

import com.cd.bootdemo.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@SpringBootApplication
@RestController
public class BootDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(BootDemoApplication.class, args);
    }

    @GetMapping("/sayHi")
    public String queryUser (@Valid User user) {

        return "hello, " + user;
    }

}
