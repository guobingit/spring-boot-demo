package com.kimi.demo.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class DemoAction {

    @RequestMapping("")
    public String demo(Model model){
        model.addAttribute("world", "world1");
        return "/demo/hello";
    }
}
