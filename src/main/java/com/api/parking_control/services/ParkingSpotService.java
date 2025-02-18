package com.api.parking_control.services;

import com.api.parking_control.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this. parkingSpotRepository = parkingSpotRepository;
    }

    // ponto de injecao do nosso parkingSpotRrepository
    // sempre que tiver alguma transacao, o controler ao inves de solicitar direto ao SpotModel
    // vem primeiro aoService atraves do @autowired
}
