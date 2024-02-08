package com.colak.traveller.controller;

import com.colak.traveller.feign.ItenaryModel;
import com.colak.traveller.feign.ItineraryClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/traveller")
@RequiredArgsConstructor
public class TravellerController {

    private final ItineraryClient itineraryClient;

    // http://localhost:8081/api/traveller/welcomeTraveller
    @GetMapping("welcomeTraveller")
    public String welcomeTraveller() {
        return "Welcome Traveller!!";
    }

    // http://localhost:8081/api/traveller/getitenaries
    @GetMapping("/getitenaries")
    public List<ItenaryModel> getItenaries() {
        return itineraryClient.getitenaries();
    }
}
