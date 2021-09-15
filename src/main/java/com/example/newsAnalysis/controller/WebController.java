package com.example.newsAnalysis.controller;

import com.example.newsAnalysis.mapper.WebMapper;
import com.example.newsAnalysis.domain.RankDayVO;
import com.example.newsAnalysis.service.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/**")
@Controller
@RequiredArgsConstructor
public class WebController {
    @Resource
    WebService webService;

    @RequestMapping(value = {"/dataCollected"})
    public String dataCollected(Model model) {
        model.addAttribute("aaa", "bbb");
        model.addAttribute("title", "dataCollected");


        return "dataCollected";
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
