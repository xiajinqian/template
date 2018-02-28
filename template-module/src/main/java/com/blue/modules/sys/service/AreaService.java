/**
 * 
 */
package com.blue.modules.sys.service;

import com.blue.modules.sys.entity.SysArea;

import com.blue.modules.sys.dao.SysAreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 区域Service
 * 
 * @author ThinkGem
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class AreaService{

	@Autowired
	private SysAreaMapper sysAreaMapper;

	public List<SysArea> findAll() {
		List<SysArea> areaList = sysAreaMapper.findAll();
		return areaList;
	}

	public SysArea getById(String id) {
		SysArea area = sysAreaMapper.getById(id);
		return area;
	}

	/*public List<SysArea> findList(SysArea area) {
		return sysAreaMapper.findList2(area);
	}

	@Transactional(readOnly = false)
	public int save(Area area) {
		int i = super.save(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
		return i;
	}

	@Transactional(readOnly = false)
	public void delete(Area area) {
		super.delete(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}

	@Transactional(readOnly = false)
	public void updatePublishRegion(Area area){
		areaDao.updatePublishRegion(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}*/
}
