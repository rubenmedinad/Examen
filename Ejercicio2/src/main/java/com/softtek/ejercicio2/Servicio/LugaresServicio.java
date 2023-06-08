package com.softtek.ejercicio2.Servicio;

import com.softtek.ejercicio2.Modelos.Lugares;
import com.softtek.ejercicio2.Repositorio.ILugaresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LugaresServicio implements ILugaresServicio {
    @Autowired
    private ILugaresRepo repo;

    @Override
    public Lugares createLugar(Lugares lugar) {
        return repo.save(lugar);
    }
}