package com.webproject.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Igor on 12.07.2017.
 */
@Controller
public class YourServlet {

    @RequestMapping(path = "/hello")
    public String hello() {
        return "hello world";
    }

}
