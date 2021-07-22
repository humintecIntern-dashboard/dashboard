package com.humintecTest.dashboard.dao;


import com.humintecTest.dashboard.request.DateRequestFormat;
import com.humintecTest.dashboard.vo.PidVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PidDao {
    public List<PidVo> selectPid (PidVo vo);
    public int insertPid(PidVo vo);
    public int deletePid();
    public List<PidVo> searchPidByDate (DateRequestFormat req);
    public List<PidVo> showPid (PidVo vo);
}