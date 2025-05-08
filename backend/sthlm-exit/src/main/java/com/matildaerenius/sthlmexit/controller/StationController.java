package com.matildaerenius.sthlmexit.controller;

import com.matildaerenius.sthlmexit.entity.Station;
import com.matildaerenius.sthlmexit.repository.StationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stations")
public class StationController {

    private final StationRepository stationRepository;

    public StationController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @GetMapping
    public List<Station> getAllStations() {
        return stationRepository.findAll();
    }

    @GetMapping("/{name}")
    public Station getByName(@PathVariable String name) {
        return stationRepository.findByNameIgnoreCase(name);
    }
}
