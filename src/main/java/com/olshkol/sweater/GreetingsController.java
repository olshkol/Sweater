package com.olshkol.sweater;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingsController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
                            Map<String, Object> model){
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model){
        model.put("some", "hello, lets code");
        return "main";
    }
}
