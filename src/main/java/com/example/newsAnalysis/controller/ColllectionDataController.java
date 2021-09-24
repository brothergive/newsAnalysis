package com.example.newsAnalysis.controller;

import com.example.newsAnalysis.model.CollectionStatusVO;
import com.example.newsAnalysis.model.DataCollectionInputVO;
import com.example.newsAnalysis.service.CollectionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/collectionData")
public class ColllectionDataController {

    @Autowired
    CollectionDataService service;

    @RequestMapping("view")
    public void dataCollection(Model model, DataCollectionInputVO inputVO) {
        System.out.println(inputVO);
        for (CollectionStatusVO vo : service.dataStatus(inputVO)) {
            System.out.println(vo);
        }
        model.addAttribute("dataStatus",service.dataStatus(inputVO));
    }

}
