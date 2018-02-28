package com.blue.modules.sys.dao;

import com.blue.modules.annotation.MyBatisDao;
import com.blue.modules.sys.entity.SysConfig;
import com.blue.modules.sys.entity.SysConfigExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
@Mapper
public interface SysConfigMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    List<SysConfig> selectByExampleWithBLOBs(SysConfigExample example);

    List<SysConfig> selectByExample(SysConfigExample example);

    SysConfig selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKeyWithBLOBs(SysConfig record);

    int updateByPrimaryKey(SysConfig record);

    List<SysConfig> findByKey(@Param("key") String key);
}