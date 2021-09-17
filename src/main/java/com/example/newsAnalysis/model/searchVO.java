package com.example.newsAnalysis.model;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class searchVO {
    private String title;
    private String author;
    private String classification;
    private Date newsDate;

}
