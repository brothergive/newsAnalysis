package com.example.newsAnalysis.mapper;

import com.example.newsAnalysis.domain.RankDayVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {
    int boardCount();

    List<RankDayVO> getList();
}

