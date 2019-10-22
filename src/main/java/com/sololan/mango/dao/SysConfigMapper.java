package com.sololan.mango.dao;

import com.sololan.mango.model.SysConfig;

public interface SysConfigMapper {
    int insert(SysConfig record);

    int insertSelective(SysConfig record);
}