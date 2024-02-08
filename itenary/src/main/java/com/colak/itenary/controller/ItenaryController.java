package com.colak.itenary.controller;

import com.colak.itenary.model.ItenaryModel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/itenary")
@RequiredArgsConstructor
public class ItenaryController {

    // http://localhost:8080/api/itenary/getitenaries
    @GetMapping(path = "getitenaries")
    public List<ItenaryModel> getItenaries() {
        List<ItenaryModel> resultList = new ArrayList<>();

        ItenaryModel tm = new ItenaryModel("itenary1");
        resultList.add(tm);
        return resultList;
    }
}
