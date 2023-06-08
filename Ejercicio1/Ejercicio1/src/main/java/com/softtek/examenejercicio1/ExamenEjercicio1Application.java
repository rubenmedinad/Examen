package com.softtek.examenejercicio1;

import com.softtek.examenejercicio1.model.Factura;
import com.softtek.examenejercicio1.model.Ivasuperreducido;
import com.softtek.examenejercicio1.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExamenEjercicio1Application implements CommandLineRunner {

    @Autowired
    Factura factura;
    public static void main(String[] args) {
        SpringApplication.run(ExamenEjercicio1Application.class, args);
    }

    public void run(String... args) throws Exception {

        //Instanciar Objetos
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Jamón de pavo",1.2));
        productos.add(new Producto("Pack de 6 litros de leche", 5.4 ));
        productos.add(new Producto("Pack extragrande de Jamón ibérico", 7.2 ));
        productos.add(new Producto("Huevo Kinder", 1.5 ));


        factura.setProductos(productos);
        System.out.println("La factura con iva general es de: " + factura.calcularFactura());

        factura.setImpuesto(new Ivasuperreducido());
        System.out.println("La factura con iva reducido es de: " + factura.calcularFactura());
    }


}
