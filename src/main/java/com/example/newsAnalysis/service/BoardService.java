package com.example.newsAnalysis.service;


import com.example.newsAnalysis.domain.RankDayVO;
import com.example.newsAnalysis.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {
    private final BoardMapper boardMapper;

    public int boardCount() {
        return boardMapper.boardCount();
    }

    public List<RankDayVO> boardList() {
        return boardMapper.getList();
    }
}
