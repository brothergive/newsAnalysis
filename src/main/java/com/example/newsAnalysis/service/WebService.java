package com.example.newsAnalysis.service;

import com.example.newsAnalysis.model.RankDayVO;
import com.example.newsAnalysis.mapper.WebMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class WebService {
    private final WebMapper webMapper;

    /***
     * 날짜에 따른 수집 뉴스의 갯수를 반환합니다.
     * 수집 데이터-수집현황
     * @param startDate
     * @param endDate
     * @return
     */
    public List<RankDayVO> getCountUrlByDay(Date startDate, Date endDate) {
        return webMapper.getCountUrlByDay(startDate, endDate);
    }

    public List<RankDayVO> getNewsListByCondition(Date startDate, Date endDate, String classification, String division, String search) {


        List<RankDayVO> rankDayVOList = new ArrayList<>();

        return rankDayVOList;
    }

}
