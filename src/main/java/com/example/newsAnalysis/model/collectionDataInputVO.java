package com.example.newsAnalysis.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class collectionDataInputVO {
    Date startDate;
    Date endDate;
    String classification;
    String division;
    String searchKeyword;
}
