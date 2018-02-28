package com.blue.modules.sys.dao;

import com.blue.modules.annotation.MyBatisDao;
import com.blue.modules.sys.entity.SysAddress;
import com.blue.modules.sys.entity.SysAddressExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@MyBatisDao
@Mapper
public interface SysAddressMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysAddress record);

    int insertSelective(SysAddress record);

    List<SysAddress> selectByExample(SysAddressExample example);

    SysAddress selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysAddress record);

    int updateByPrimaryKey(SysAddress record);
}