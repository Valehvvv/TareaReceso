package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestMain {

    @Test
    void testVehiculo() {
        Vehiculo vehiculo = new Vehiculo("bicicleta", 18);
        assertEquals("bicicleta", vehiculo.tipo);
        assertEquals(18, vehiculo.velocidad);
    }

    @Test
    void testDestino() {
        Destino destino = new Destino(1.2, "Portal");
        assertEquals(1.2, destino.distanciaRespectoOrigen);
        assertEquals("Portal", destino.nombreDestino);
    }

    @Test
    void testPersona() {
        Vehiculo vehiculo = new Vehiculo("bicicleta", 18);
        Destino destino = new Destino(1.2, "Portal");
        Persona persona = new Persona("Valentina", vehiculo, destino);
        assertEquals("Valentina", persona.nombre);
        assertEquals(vehiculo, persona.vehiculo);
        assertEquals(destino, persona.destino);
    }

    @Test
    void testCalcularTiempoLlegada() {
        Vehiculo vehiculo = new Vehiculo("bicicleta", 18);
        Destino destino = new Destino(1.2, "Portal");
        Persona persona = new Persona("Valentina", vehiculo, destino);
        double tiempoEnHoras = destino.distanciaRespectoOrigen / vehiculo.velocidad;
        double tiempoEnMinutos = tiempoEnHoras * 60;
        assertEquals(tiempoEnHoras, persona.calcularTiempoLlegada());
    }
}
