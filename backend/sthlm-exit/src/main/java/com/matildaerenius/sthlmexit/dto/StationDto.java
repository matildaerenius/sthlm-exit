package com.matildaerenius.sthlmexit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StationDto {
    private Long id;
    private String name;
    private String line;
    private double latitude;
    private double longitude;
    private List<ExitDto> exits;
}
