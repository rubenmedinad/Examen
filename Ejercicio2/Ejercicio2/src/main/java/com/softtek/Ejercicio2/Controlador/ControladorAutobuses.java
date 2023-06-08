package com.softtek.examenejercicio2.Controlador;

import com.softtek.examenejercicio2.model.Autobuses;
import com.softtek.examenejercicio2.service.AutobusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
@RestController
@RequestMapping("/autobuses")
public class ControladorAutobuses {
    @Autowired
    AutobusServiceImpl autobusesService;
    @GetMapping("/all")
    ResponseEntity<List<Autobuses>> getAll() throws Exception{
        return ResponseEntity.ok(autobusesService.getAll());
    }

    @GetMapping("/{matricula}")
    ResponseEntity<Autobuses> getAutobusByMatricula(@PathVariable("matricula") String matricula) throws Exception{
        return ResponseEntity.ok(autobusesService.getById(matricula));
    }
}
