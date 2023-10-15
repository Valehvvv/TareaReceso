package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido, calcule el timpo de llegada respecto a su hogar");// teniendo en cuenta que las distacias a los destinos que deje cm preestablecidos son un simple ejemplo

        Destino portal = new Destino(1.2, "Portal");
        Destino universidad = new Destino(2.9, "Universidad");
        Destino supermercado = new Destino(1.6, "Supermercado");

        System.out.print("Por favor, ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();


        System.out.println("Por favor, seleccione el tipo de vehículo:");
        System.out.println("1 - Bicicleta (Velocidad: 18 km/h)");
        System.out.println("2 - Auto (Velocidad: 56 km/h)");
        System.out.println("3 - Motocicleta (Velocidad: 35 km/h)");

        int seleccionVehiculo = scanner.nextInt();
        Vehiculo vehiculo = null;

        switch (seleccionVehiculo) {
            case 1:
                vehiculo = new Vehiculo("bicicleta", 18);
                break;
            case 2:
                vehiculo = new Vehiculo("auto", 56);
                break;
            case 3:
                vehiculo = new Vehiculo("motocicleta", 35);
                break;
            default:
                System.out.println("Selección de vehículo no válida.");
                return;
        }


        System.out.println("Por favor, seleccione el destino:");
        System.out.println("1 - Portal (Distancia: 1.2 km)");
        System.out.println("2 - Universidad (Distancia: 2.9 km)");
        System.out.println("3 - Supermercado (Distancia: 1.6 km)");

        int seleccionDestino = scanner.nextInt();
        Destino destinoObj = null;

        switch (seleccionDestino) {
            case 1:
                destinoObj = portal;
                break;
            case 2:
                destinoObj = universidad;
                break;
            case 3:
                destinoObj = supermercado;
                break;
            default:
                System.out.println("Selección de destino no válida.");
                return;
        }

        Persona persona = new Persona(nombre, vehiculo, destinoObj);

        persona.calcularTiempoLlegada();
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

    public void calcularTiempoLlegada() {
        double tiempoEnHoras = destino.distanciaRespectoOrigen / vehiculo.velocidad;
        double tiempoEnMinutos = tiempoEnHoras * 60;

        System.out.println("¡Hola " + nombre + "!");
        System.out.println("Para llegar a " + destino.nombreDestino + " en " + vehiculo.tipo + ":");
        System.out.println("Aproximadamente tomará " + tiempoEnHoras + " horas y " + tiempoEnMinutos + " minutos.");
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
    public double distanciaRespectoOrigen;
    public String nombreDestino;

    public Destino(double distanciaRespectoOrigen, String nombreDestino) {
        this.distanciaRespectoOrigen = distanciaRespectoOrigen;
        this.nombreDestino = nombreDestino;
    }
}






