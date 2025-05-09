package com.ubicate.geolocalication.mocroservice.geolocalication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bus {
    private String id;
    private double latitude;
    private double longitude;
    private String route;
    private String routeStatus;
}

