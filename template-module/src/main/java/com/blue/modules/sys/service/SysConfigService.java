/**
 *
 */
package com.blue.modules.sys.service;

import com.blue.modules.sys.dao.SysConfigMapper;
import com.blue.modules.sys.entity.SysConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 系统参数Service
 * @author Blue
 * @version 2018-2-24
 */
@Service
@Transactional(readOnly = true)
public class SysConfigService {

	@Autowired
	private SysConfigMapper sysConfigMapper;
	
    public SysConfig get(String id) {
        return sysConfigMapper.selectByPrimaryKey(id);
    }

    /*@Transactional(readOnly = false)
    public int save(SysConfig2 sysConfig) {
        return super.save(sysConfig);
    }

    @Transactional(readOnly = false)
    public void delete(SysConfig2 sysConfig) {
        super.delete(sysConfig);
    }
    */
    public String getByKey(String key) {
    	List<SysConfig> configs =  sysConfigMapper.findByKey(key);
    	if(configs != null && configs.size() > 0){
    		return configs.get(0).getConfigValue();
    	}
    	return null;
    }

}