package com.humintecTest.dashboard.service;

import com.humintecTest.dashboard.dao.StorageTableDao;
import com.humintecTest.dashboard.vo.StorageTableVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageTableServiceImpl implements StorageTableService{
    @Autowired
    StorageTableDao storageTableDao;

    @Override
    public List<StorageTableVo> selectStorageTable(StorageTableVo vo) {
        return storageTableDao.selectStorageTable(vo);
    }

    @Override
    public int insertStorageTable(StorageTableVo vo) {
        try {
            storageTableDao.insertStorageTable(vo);
            return 0;
        }
        catch (Exception e){
            return -1;
        }
    }
}