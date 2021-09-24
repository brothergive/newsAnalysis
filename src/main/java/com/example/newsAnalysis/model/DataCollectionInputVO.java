package com.example.newsAnalysis.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class DataCollectionInputVO {
    String startDate;
    String endDate;
    String classification;
    String division;
    String searchKeyword;
}
