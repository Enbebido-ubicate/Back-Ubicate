package com.ubicate.geolocalication.mocroservice.geolocalication.service;

import com.ubicate.geolocalication.mocroservice.geolocalication.model.Bus;
import com.ubicate.geolocalication.mocroservice.geolocalication.repository.BusLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusLocationService {

    @Autowired
    private BusLocationRepository busLocationRepository;

    // Actualiza la ubicación del bus en Firebase
    public void updateBusLocation(Bus bus) {
        busLocationRepository.saveBusLocation(bus);  // Guardamos en Firebase
    }

    // Obtiene la información del bus desde Firebase
    public Bus getBusById(String id) {
        return busLocationRepository.getBusLocationById(id);
    }
}
