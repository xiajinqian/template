package com.blue.modules.sys.dao;

import com.blue.modules.annotation.MyBatisDao;
import com.blue.modules.sys.entity.SysArea;
import com.blue.modules.sys.entity.SysAreaExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@MyBatisDao
@Mapper
public interface SysAreaMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysArea record);

    int insertSelective(SysArea record);

    List<SysArea> selectByExample(SysAreaExample example);

    SysArea getById(String id);

    int updateByPrimaryKeySelective(SysArea record);

    int updateByPrimaryKey(SysArea record);

    List<SysArea> findAll();
}