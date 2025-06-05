    package org.example.models;

import java.util.Date;

public class Pasaje {
    
    //atributos propios
    private Integer codigoDePasaje;
    private Date fechaDeLlegada;
    private Date fechaDeSalida;
    
    //atributos de relacion
    private ClaseDeVuelo claseDeVueloIda;
    private ClaseDeVuelo claseDeVueloVuelta;
    
    private Vuelo vueloDeIda;
    private Vuelo vueloDeVuelta;
    
    private Turista turista;
    
    private Hotel hotelDeHospedaje;
    
    private RegimenDeHospedaje regimenDeHospedaje;
    
    private Sucursal sucursalDeCompra;

}

