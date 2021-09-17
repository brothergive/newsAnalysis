package com.example.newsAnalysis.mapper;

import com.example.newsAnalysis.model.RankDayVO;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface WebMapper {
    List<RankDayVO> getCountUrlByDay(Date startDate, Date endDate);

}
