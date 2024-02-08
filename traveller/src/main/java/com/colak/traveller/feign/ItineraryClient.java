package com.colak.traveller.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "itenary")
public interface ItineraryClient {

    @GetMapping(path = "getitenaries")
    List<ItenaryModel> getitenaries();
}
