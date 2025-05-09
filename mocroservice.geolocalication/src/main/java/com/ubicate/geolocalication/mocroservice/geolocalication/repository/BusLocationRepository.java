package com.ubicate.geolocalication.mocroservice.geolocalication.repository;

import com.ubicate.geolocalication.mocroservice.geolocalication.model.Bus;
import org.springframework.stereotype.Repository;

@Repository
public class BusLocationRepository {

    // Este método debe interactuar con Firebase para guardar la ubicación del bus
    public void saveBusLocation(Bus bus) {
    }

    // Este método debe recuperar la información del bus desde Firebase
    public Bus getBusLocationById(String id) {
        return new Bus(id, 12.9716, 77.5946, "Ruta 1", "En ruta");

    }
}
