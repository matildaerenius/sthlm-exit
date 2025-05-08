package com.matildaerenius.sthlmexit.repository;

import com.matildaerenius.sthlmexit.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
    Station findByNameIgnoreCase(String name);
}
