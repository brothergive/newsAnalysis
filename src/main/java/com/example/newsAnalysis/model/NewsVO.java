package com.example.newsAnalysis.model;

import lombok.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class NewsVO {
    private String title;
    private String author;
    private String classification;
    private Date newsDate;
    private List<KeywordVO> keywordVOList;


}
