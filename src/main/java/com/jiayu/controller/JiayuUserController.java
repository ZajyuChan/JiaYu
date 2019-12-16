package com.jiayu.controller;

import com.jiayu.model.JiayuUser;
import com.jiayu.service.JiayuUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class JiayuUserController {

    @Resource
    private JiayuUserService jiayuUserService;

    @GetMapping("/findAll")
    public String findAll(Model model) {
        List<JiayuUser> jiayuUserList = jiayuUserService.findAll();
        for (JiayuUser jiayuUser : jiayuUserList) {
            System.out.println("id:" + jiayuUser.getId());
            System.out.println("name:" + jiayuUser.getName());
        }
        return "hello";
    }
}
