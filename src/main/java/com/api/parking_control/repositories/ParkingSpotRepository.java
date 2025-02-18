package com.api.parking_control.repositories;

import com.api.parking_control.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//@repositori é uma dos esteretipos do spring para transações com base de dados
@Repository
public interface ParkingSpotRepository extends JpaRepository <ParkingSpotModel, UUID>{
}

// extendeu jpaRepo pq ja possuem varios metods para transações de banco de dados:
// buscar listage, deletar, atualizar etc
// se nao precisaria fazer cada uma dessas queries, etc