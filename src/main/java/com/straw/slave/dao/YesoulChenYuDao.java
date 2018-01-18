package com.straw.slave.dao;

import com.straw.slave.model.YesoulChenYu;

public interface YesoulChenYuDao {
    int insert(YesoulChenYu record);

    int insertSelective(YesoulChenYu record);
}