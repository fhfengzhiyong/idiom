package com.straw.slave.dao;

import com.straw.slave.model.Yesoulchenyu;

public interface YesoulchenyuDao {
    int deleteByPrimaryKey(String id);

    int insert(Yesoulchenyu record);

    int insertSelective(Yesoulchenyu record);

    Yesoulchenyu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Yesoulchenyu record);

    int updateByPrimaryKey(Yesoulchenyu record);
}