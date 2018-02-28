package com.blue.modules.sys.dao;

import com.blue.modules.annotation.MyBatisDao;
import com.blue.modules.sys.entity.SysNews;
import com.blue.modules.sys.entity.SysNewsExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@MyBatisDao
@Mapper
public interface SysNewsMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysNews record);

    int insertSelective(SysNews record);

    List<SysNews> selectByExampleWithBLOBs(SysNewsExample example);

    List<SysNews> selectByExample(SysNewsExample example);

    SysNews selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysNews record);

    int updateByPrimaryKeyWithBLOBs(SysNews record);

    int updateByPrimaryKey(SysNews record);
}