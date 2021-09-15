package com.example.newsAnalysis.mapper;

import com.example.newsAnalysis.domain.RankDayVO;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface WebMapper {
List<RankDayVO> getNewsByCondition(Date startDate,Date endDate, String classification, String division);

}
