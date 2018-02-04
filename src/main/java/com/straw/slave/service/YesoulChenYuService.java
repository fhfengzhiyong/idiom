package com.straw.slave.service;


import com.straw.slave.model.Yesoulchenyu;

public interface YesoulChenYuService {

    /**
     *
     * @param 根据id查询数据
     * @return
     */
    Yesoulchenyu selectById(String id);
}
