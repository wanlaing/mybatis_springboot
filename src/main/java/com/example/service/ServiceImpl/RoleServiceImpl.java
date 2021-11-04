package com.example.service.ServiceImpl;

import com.example.entity.Roles;
import com.example.mapper.RoleMapper;
import com.example.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RolesService {
    @Autowired
    RoleMapper roleMapper;
    @Override
    public List<Roles> getList(){
        return roleMapper.getList();
    }
}
