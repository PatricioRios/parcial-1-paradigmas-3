package org.example.models;

import java.util.List;

public class Aeropuerto {
    private String nombre;
    
    
    private Direccion direccion;
    
    private List<Vuelo> vuelosDeLLegada;
    private List<Vuelo> vuelosDeSalida;
}