package com.matildaerenius.sthlmexit.controller;

import com.matildaerenius.sthlmexit.dto.ExitDto;
import com.matildaerenius.sthlmexit.dto.StationDto;
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
    public List<StationDto> getAllStations() {
        return stationRepository.findAll().stream()
                .map(station -> new StationDto(
                        station.getId(),
                        station.getName(),
                        station.getLine(),
                        station.getLatitude(),
                        station.getLongitude(),
                        station.getExits().stream()
                                .map(exit -> new ExitDto(
                                        exit.getId(),
                                        exit.getName(),
                                        exit.getLatitude(),
                                        exit.getLongitude(),
                                        exit.getTrainPosition()
                                ))
                                .toList()
                ))
                .toList();
    }


    private StationDto toDto(Station station) {
        List<ExitDto> exits = station.getExits().stream()
                .map(exit -> new ExitDto(
                        exit.getId(),
                        exit.getName(),
                        exit.getLatitude(),
                        exit.getLongitude(),
                        exit.getTrainPosition()
                ))
                .toList();

        return new StationDto(
                station.getId(),
                station.getName(),
                station.getLine(),
                station.getLatitude(),
                station.getLongitude(),
                exits
        );
    }
}
