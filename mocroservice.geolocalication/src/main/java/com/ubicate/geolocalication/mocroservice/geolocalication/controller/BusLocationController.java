package com.ubicate.geolocalication.mocroservice.geolocalication.controller;

import com.ubicate.geolocalication.mocroservice.geolocalication.model.Bus;
import com.ubicate.geolocalication.mocroservice.geolocalication.service.BusLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bus")
public class BusLocationController {

    @Autowired
    private BusLocationService busLocationService;

    // Endpoint para actualizar la ubicación del bus
    @PostMapping("/updateLocation")
    public String updateBusLocation(@RequestBody Bus bus) {
        busLocationService.updateBusLocation(bus);
        return "Ubicación actualizada correctamente.";
    }

    // Endpoint para obtener información de un bus por su ID
    @GetMapping("/{id}")
    public Bus getBusById(@PathVariable String id) {
        return busLocationService.getBusById(id);
    }
}
