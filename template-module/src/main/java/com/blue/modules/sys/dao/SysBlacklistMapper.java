package com.blue.modules.sys.dao;

import com.blue.modules.annotation.MyBatisDao;
import com.blue.modules.sys.entity.SysBlacklist;
import com.blue.modules.sys.entity.SysBlacklistExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@MyBatisDao
@Mapper
public interface SysBlacklistMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysBlacklist record);

    int insertSelective(SysBlacklist record);

    List<SysBlacklist> selectByExample(SysBlacklistExample example);

    SysBlacklist selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysBlacklist record);

    int updateByPrimaryKey(SysBlacklist record);
}