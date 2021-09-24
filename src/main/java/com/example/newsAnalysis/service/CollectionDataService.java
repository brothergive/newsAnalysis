package com.example.newsAnalysis.service;

import com.example.newsAnalysis.mapper.DataCollectionMapper;
import com.example.newsAnalysis.model.CollectionStatusVO;
import com.example.newsAnalysis.model.DataCollectionInputVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionDataService {
    @Autowired
    DataCollectionMapper mapper;

    public List<CollectionStatusVO> dataStatus(DataCollectionInputVO inputVO) {
        return mapper.dataStatus(inputVO);
    }
}
