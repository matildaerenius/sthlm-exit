package com.matildaerenius.sthlmexit.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Exit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double latitude;
    private double longitude;

    private String trainPosition;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

}
