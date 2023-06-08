package com.softtek.ejercicio2;

import com.softtek.ejercicio2.Modelos.Autobuses;
import com.softtek.ejercicio2.Modelos.Conductores;
import com.softtek.ejercicio2.Modelos.Lugares;
import com.softtek.ejercicio2.Modelos.Visitas;
import com.softtek.ejercicio2.Servicio.AutobusServicioImpl;
import com.softtek.ejercicio2.Servicio.ConductoresServicio;
import com.softtek.ejercicio2.Servicio.LugaresServicio;
import com.softtek.ejercicio2.Servicio.VisitasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Ejercicio2Application implements CommandLineRunner {

    @Autowired
    private AutobusServicioImpl autobusService;
    @Autowired
    private VisitasServicio visitasService;

    @Autowired
    private LugaresServicio lugaresService;
    @Autowired
    private ConductoresServicio conductoresService;
    public static void main(String[] args) {
        SpringApplication.run(Ejercicio2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Autobuses autobus = new Autobuses();
        autobus.setMatricula("9631LPS");
        autobus.setAFabricacion(2009);

        Autobuses autobus2 = new Autobuses();
        autobus2.setMatricula("8642BBB");
        autobus2.setAFabricacion(2002);


        Lugares lugar = new Lugares();
        lugar.setNombre("Plaza de Cibeles");

        Lugares lugar2 = new Lugares();
        lugar2.setNombre("Plaza de Neptuno");


        Conductores conductor=new Conductores();
        conductor.setDni("12345678A");
        conductor.setNombre("Jose María Jimenez");

        Conductores conductor2=new Conductores();
        conductor2.setDni("12345678B");
        conductor2.setNombre("Marta del Castillo");


        Visitas visita = new Visitas();
        visita.setDate(LocalDate.now());
        visita.setAutobus(autobus);
        visita.setConductor(conductor);
        visita.setLugar(lugar);

        visitasService.createVisita(visita);




    }

}