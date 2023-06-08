package com.softtek.ejercicio2.Servicio;

import com.softtek.ejercicio2.Modelos.Visitas;
import com.softtek.ejercicio2.Repositorio.IVisitasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitasServicio implements IVisitasServicio{
    @Autowired
    IVisitasRepo repoVisitas;

    @Override
    public Visitas createVisita(Visitas visita) throws Exception{
        return repoVisitas.save(visita);
    }

}