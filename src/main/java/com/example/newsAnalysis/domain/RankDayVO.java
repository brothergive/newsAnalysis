package com.example.newsAnalysis.domain;

import lombok.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RankDayVO {
    private Date rankDate;
    private List<NewsVO> newsVOList;

}


