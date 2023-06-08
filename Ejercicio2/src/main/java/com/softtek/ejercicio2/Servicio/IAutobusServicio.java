package com.softtek.ejercicio2.Servicio;

import com.softtek.ejercicio2.Modelos.Autobuses;

import java.util.List;

public interface IAutobusServicio {

    Autobuses createAutobus(Autobuses autobus) throws Exception;
    List<Autobuses> getAll() throws Exception;

    Autobuses getById(String id) throws Exception;

    void removeAutobus(Autobuses autobus) throws Exception;

    Autobuses updateAutobus(Autobuses autobus) throws Exception;


}