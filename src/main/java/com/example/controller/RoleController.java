package com.example.controller;

import com.example.entity.Roles;
import com.example.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
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

}
