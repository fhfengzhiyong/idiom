package com.straw.slave.service.impl;

import com.straw.slave.dao.YesoulchenyuDao;
import com.straw.slave.model.Yesoulchenyu;
import com.straw.slave.service.YesoulChenYuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("yesoulChenYuService")
public class YesoulChenYuServiceImpl implements YesoulChenYuService {
    @Resource
    YesoulchenyuDao yesoulChenYuDao;

    @Override
    public Yesoulchenyu selectById(String id) {
        return yesoulChenYuDao.selectByPrimaryKey(id);
    }
}
