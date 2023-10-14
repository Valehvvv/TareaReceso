package org.example;

public class Main {
    public static void main(String[] args) {
        // Puedes agregar código en el método main si es necesario.
    }
}

class Persona {
    public String nombre;
    public Vehiculo vehiculo;
    public Destino destino;

    public Persona(String nombre, Vehiculo vehiculo, Destino destino) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
        this.destino = destino;
    }
}

class Vehiculo {
    public String tipo;
    public int velocidad;

    public Vehiculo(String tipo, int velocidad) {
        this.tipo = tipo;
        this.velocidad = velocidad;
    }
}

class Destino {
    public int distanciaRespectoOrigen;
    public String nombreDestino;

    public Destino(int distanciaRespectoOrigen, String nombreDestino) {
        this.distanciaRespectoOrigen = distanciaRespectoOrigen;
        this.nombreDestino = nombreDestino;
    }
}

