package com.example.newsAnalysis.model;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RankDayVO {
    private Date rankDate;
    private int newsCount;

}


