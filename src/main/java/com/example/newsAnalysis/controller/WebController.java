package com.example.newsAnalysis.controller;

import com.example.newsAnalysis.service.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/web/**")
@RequiredArgsConstructor
public class WebController {

    private final WebService webService;

    @RequestMapping(value = {"/dataCollected"})
    public String dataCollected(Model model) {
        Date startDate = new Date("2021-01-01");
        Date endDate = new Date("2021-02-01");
        String classification = "경제";
        String division = "title";// 값 넘길때 제목:title 로 멥핑해서 받아옴
        String search = "그것";


        model.addAttribute("newsListByCondition",
                webService.getNewsListByCondition(startDate, endDate, classification, division, search));


        return "/dataCollected";
    }









    @RequestMapping(value = {"/classificationAnalysis"})
    public String classificationAnalysis(Model model) {

        return "classificationAnalysis";
    }

    @RequestMapping(value = {"/keywordAnalysis"})
    public String keywordAnalysis(Model model) {

        model.addAttribute("title", "keywordAnalysis");

        return "keywordAnalysis";
    }

}
