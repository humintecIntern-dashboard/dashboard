package com.humintecTest.dashboard.service;

import com.humintecTest.dashboard.dao.PidDao;
import com.humintecTest.dashboard.vo.PidVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PidServiceImpl implements PidService {
    @Autowired
    PidDao pidDao;

    @Override
    public List<PidVo> selectPid(PidVo vo) {
        return pidDao.selectPid(vo);
    }

    @Override
    public int insertPid(PidVo vo) {
        try {
            pidDao.insertPid(vo);
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public int deletePid(PidVo vo) {
        try {
            pidDao.deletePid(vo);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public List<PidVo> searchPid(PidVo vo) {
        try {
            return pidDao.searchPid(vo);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public List<PidVo> showPid(PidVo vo) {
        return pidDao.showPid(vo);
    }

    @Override
    public List<PidVo> selPidMonth(PidVo vo) {
        return pidDao.selPidMonth(vo);
    }

    @Override
    public List<PidVo> selPidYear(PidVo vo) {
        return pidDao.selPidYear(vo);
    }
}