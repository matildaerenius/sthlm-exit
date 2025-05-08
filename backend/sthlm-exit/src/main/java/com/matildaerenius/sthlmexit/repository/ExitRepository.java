package com.matildaerenius.sthlmexit.repository;

import com.matildaerenius.sthlmexit.entity.Exit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExitRepository extends JpaRepository<Exit, Long> {
    List<Exit> findByStationNameIgnoreCase(String stationName);
}
