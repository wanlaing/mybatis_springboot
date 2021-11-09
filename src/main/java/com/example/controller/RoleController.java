package com.example.controller;

import com.example.entity.Roles;
import com.example.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wanlx
 */
@RestController
public class RoleController {
    @Autowired
    RolesService rolesService;

    @RequestMapping("/get")
    public List<Roles> getList() {
        return rolesService.getList();
    }

    @RequestMapping("/t1")
    public String test1(Model model){
        //存入数据
         model.addAttribute("msg","Hello,Thymeleaf");
        //classpath:/templates/test.html
        return "test";
    }

}
