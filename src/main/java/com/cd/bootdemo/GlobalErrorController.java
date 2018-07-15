package com.cd.bootdemo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalErrorController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "error";
    }

    @GetMapping("/error")
    public String errorPage () {
        return "error occurs";
    }

}
