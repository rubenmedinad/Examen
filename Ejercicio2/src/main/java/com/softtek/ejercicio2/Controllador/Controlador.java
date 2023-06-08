package com.softtek.ejercicio2.Controllador;

import com.softtek.ejercicio2.Modelos.Autobuses;
import com.softtek.ejercicio2.Servicio.AutobusServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
@RestController
@RequestMapping("/autobuses")
public class Controlador {
    @Autowired
    AutobusServicioImpl autobusesService;
    @GetMapping("/all")
    ResponseEntity<List<Autobuses>> getAll() throws Exception{
        return ResponseEntity.ok(autobusesService.getAll());
    }

    @GetMapping("/{matricula}")
    ResponseEntity<Autobuses> getAutobusByMatricula(@PathVariable("matricula") String matricula) throws Exception{
        return ResponseEntity.ok(autobusesService.getById(matricula));
    }
}