package com.humintecTest.dashboard.dao;

import com.humintecTest.dashboard.request.DateRequestFormat;
import com.humintecTest.dashboard.response.storageUseResponseFormat;
import com.humintecTest.dashboard.vo.StorageUseVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StorageUseDao {
    public List<StorageUseVo> selectStorageUse (StorageUseVo vo);
    public int insertStorageUse (StorageUseVo vo);
    public int deleteStorageUse ();
    public List<StorageUseVo> showStorageUse (StorageUseVo vo);
    public List<StorageUseVo> searchStorageUse (DateRequestFormat req);
    public List<StorageUseVo> selStorageMonth (StorageUseVo vo);
    public List<StorageUseVo> selStorageYear (StorageUseVo vo);
    
    public List<storageUseResponseFormat> selectStorageUseByDate(DateRequestFormat req);
    public List<storageUseResponseFormat> selectStorageUseByMonth(DateRequestFormat req);
    public List<storageUseResponseFormat> selectStorageUseByYear(DateRequestFormat req);
}