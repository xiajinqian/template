package com.blue.modules.sys.dao;

import com.blue.modules.annotation.MyBatisDao;
import com.blue.modules.sys.entity.SysUserRoleExample;
import com.blue.modules.sys.entity.SysUserRoleKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@MyBatisDao
@Mapper
public interface SysUserRoleMapper {

    int deleteByPrimaryKey(SysUserRoleKey key);

    int insert(SysUserRoleKey record);

    int insertSelective(SysUserRoleKey record);

    List<SysUserRoleKey> selectByExample(SysUserRoleExample example);
}