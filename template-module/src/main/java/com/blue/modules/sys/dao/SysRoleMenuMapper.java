package com.blue.modules.sys.dao;

import com.blue.modules.annotation.MyBatisDao;
import com.blue.modules.sys.entity.SysRoleMenuExample;
import com.blue.modules.sys.entity.SysRoleMenuKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@MyBatisDao
@Mapper
public interface SysRoleMenuMapper {
    int deleteByPrimaryKey(SysRoleMenuKey key);

    int insert(SysRoleMenuKey record);

    int insertSelective(SysRoleMenuKey record);

    List<SysRoleMenuKey> selectByExample(SysRoleMenuExample example);
}