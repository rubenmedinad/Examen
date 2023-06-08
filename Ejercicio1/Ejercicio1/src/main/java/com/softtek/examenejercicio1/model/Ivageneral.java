package com.softtek.examenejercicio1.model;

import org.springframework.stereotype.Component;

@Component("ivageneral")
public class Ivageneral implements IImpuesto{

    @Override
    public double calcularImpuesto(Producto p1){
        return p1.getPrecio() * 0.21;
    }
}
