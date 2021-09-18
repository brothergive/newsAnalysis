package com.example.newsAnalysis.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class collectionStatusVO {
    Date rankDate;
    int count;
}
