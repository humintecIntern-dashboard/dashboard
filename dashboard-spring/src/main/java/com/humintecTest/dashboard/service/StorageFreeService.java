package com.humintecTest.dashboard.service;

import com.humintecTest.dashboard.vo.StorageFreeVo;

import java.util.List;

public interface StorageFreeService {
    public List<StorageFreeVo> selectStorageFree(StorageFreeVo vo);
    public int insertStorageFree(StorageFreeVo vo);
    public int deleteStorageFree(StorageFreeVo vo);
    public List<StorageFreeVo> searchStorageFree(StorageFreeVo vo);
    public List<StorageFreeVo> showStorageFree(StorageFreeVo vo);
}