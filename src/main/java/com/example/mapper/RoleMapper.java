package com.example.mapper;

import com.example.entity.Roles;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wanlx
 */
@Mapper
public interface RoleMapper {
    /**
     *
     * @return
     */
     List<Roles> getList();
}
