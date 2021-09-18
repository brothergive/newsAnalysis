package com.example.newsAnalysis.controller;

import com.example.newsAnalysis.service.collectionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/collectionData")
public class collectionController {
    @Autowired
    collectionDataService service;

    @RequestMapping("view")
    public void view(Model model) {
        List<collectionStatus>
        model.addAttribute("collectionStatus",service.getCollectionStatus);
    }
}
