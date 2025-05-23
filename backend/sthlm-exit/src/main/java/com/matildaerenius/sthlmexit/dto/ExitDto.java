package com.matildaerenius.sthlmexit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExitDto {
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
    private String trainPosition;

}
