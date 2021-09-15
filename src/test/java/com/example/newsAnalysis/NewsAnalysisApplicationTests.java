package com.example.newsAnalysis;

import com.example.newsAnalysis.mapper.WebMapper;
import com.example.newsAnalysis.domain.RankDayVO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class NewsAnalysisApplicationTests {
    WebMapper webMapper;

    @Test
    void contextLoads() {
        List<RankDayVO> rankDayVOList = (List<RankDayVO>) webMapper.findAllRankDay();
        for (int i = 0; i < rankDayVOList.size(); i++) {
            System.out.println(rankDayVOList.get(i));
        }
    }

}
