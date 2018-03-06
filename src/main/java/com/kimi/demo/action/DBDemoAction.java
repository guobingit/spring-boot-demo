package com.kimi.demo.action;

import com.kimi.demo.dao.UserDao;
import com.kimi.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("demo")
public class DBDemoAction {

    @Resource
    private UserDao userDao;

    @RequestMapping("db")
    public String dbdemo(Model model) {

        List<User> users = userDao.findAll();
        model.addAttribute("users", users);
        return "/demo/db";
    }
}
