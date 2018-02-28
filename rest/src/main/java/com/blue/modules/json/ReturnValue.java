package com.blue.modules.json;

import java.io.Serializable;
import java.util.List;


/**
 * 列表查询返回值类定义
 *
 * @author tianfeng
 */
public class ReturnValue<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pageNo;
    private Integer pageSize;
    private Integer count;
    private List<T> list;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
