package com.softtek.ejercicio2.Servicio;
import com.softtek.ejercicio2.Modelos.Conductores;
import com.softtek.ejercicio2.Repositorio.IConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConductoresServicio implements IConductoresServicio {
    @Autowired
    private IConductorRepo repo;

    @Override
    public Conductores createConductor(Conductores conductor) {
        return repo.save(conductor);
    }
}