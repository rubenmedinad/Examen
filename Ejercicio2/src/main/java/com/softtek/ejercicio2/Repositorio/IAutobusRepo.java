package com.softtek.ejercicio2.Repositorio;

import com.softtek.ejercicio2.Modelos.Autobuses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutobusRepo extends JpaRepository<Autobuses,String> {
}
