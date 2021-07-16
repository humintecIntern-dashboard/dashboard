package com.humintecTest.dashboard.service;

import com.humintecTest.dashboard.dao.SlideDateDao;
import com.humintecTest.dashboard.request.DateRequestFormat;
import com.humintecTest.dashboard.vo.SlideDateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class SlideDateServiceImpl implements SlideDateService{
    @Autowired
    SlideDateDao slideDateDao;

    @Override
    public List<SlideDateVo> selectSlideDate(SlideDateVo vo) {
        return slideDateDao.selectSlideDate(vo);
    }

    @Override
    public int insertSlideDate(SlideDateVo vo) {
        try {
            slideDateDao.insertSlideDate(vo);
            return 0;
        }catch (Exception e){
            return -1;
        }
    }

    @Override
    public int deleteSlideDate() {
        try {
            slideDateDao.deleteSlideDate();
            return 0;
        }catch (Exception e){
            return -1;
        }
    }

	@Override
	public List<SlideDateVo> selectDateToDate(DateRequestFormat req) {
		return slideDateDao.selectSlidePerDateList(req);
	}
    
    
}
