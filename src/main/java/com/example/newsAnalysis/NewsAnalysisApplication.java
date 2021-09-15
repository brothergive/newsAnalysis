package com.example.newsAnalysis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.newsAnalysis")
public class NewsAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsAnalysisApplication.class, args);
    }

}
