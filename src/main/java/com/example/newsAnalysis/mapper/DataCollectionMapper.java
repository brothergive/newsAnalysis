package com.example.newsAnalysis.mapper;

import com.example.newsAnalysis.model.CollectionStatusVO;
import com.example.newsAnalysis.model.DataCollectionInputVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DataCollectionMapper {
    List<CollectionStatusVO> dataStatus(DataCollectionInputVO inputVO);
}
