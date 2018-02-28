package com.blue.modules.sys.dao;

import com.blue.modules.annotation.MyBatisDao;
import com.blue.modules.sys.entity.SysLessee;
import com.blue.modules.sys.entity.SysLesseeExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@MyBatisDao
@Mapper
public interface SysLesseeMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysLessee record);

    int insertSelective(SysLessee record);

    List<SysLessee> selectByExample(SysLesseeExample example);

    SysLessee selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysLessee record);

    int updateByPrimaryKey(SysLessee record);
}