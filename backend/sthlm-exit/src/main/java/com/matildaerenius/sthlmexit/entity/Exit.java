package com.matildaerenius.sthlmexit.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "exit_point")
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
