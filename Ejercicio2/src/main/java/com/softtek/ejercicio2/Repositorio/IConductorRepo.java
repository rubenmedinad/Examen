package com.softtek.ejercicio2.Repositorio;

import com.softtek.ejercicio2.Modelos.Conductores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConductorRepo extends JpaRepository<Conductores, Long> {
}
