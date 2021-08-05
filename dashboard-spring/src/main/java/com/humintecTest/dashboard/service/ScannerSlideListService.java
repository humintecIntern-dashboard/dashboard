package com.humintecTest.dashboard.service;

import com.humintecTest.dashboard.request.DateRequestFormat;
import com.humintecTest.dashboard.vo.ScannerSlideVo;

import java.util.List;
import java.util.Scanner;

public interface ScannerSlideListService {
    public int insertScanner(ScannerSlideVo vo);
    public List<ScannerSlideVo> selectScanner(ScannerSlideVo vo);
    public int deleteScanner();
    public List<ScannerSlideVo> showScanner(ScannerSlideVo vo);
    List<ScannerSlideVo> searchScannerList();
    List<ScannerSlideVo> searchScannerListByDate(DateRequestFormat req);
}
