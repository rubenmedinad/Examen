package com.softtek.ejercicio2.Repositorio;

import com.softtek.ejercicio2.Modelos.Lugares;
import com.softtek.ejercicio2.Modelos.Visitas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILugaresRepo extends JpaRepository<Lugares, Integer> {
}