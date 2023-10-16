# TareaReceso


● Análisis del diagrama creado:
El código calcula el tiempo de llegada de una persona a un destino específico, dependiendo del tipo de vehículo que utilice.

por lo que cree cuatro clases principales en el código: Main, Persona, Vehiculo y Destino.

Clase Main: Esta es la clase principal que ejecuta el programa. No tiene atributos propios, pero interactúa con las otras tres clases, creando instancias de ellas y utilizando sus métodos. Por lo tanto, en el diagrama UML, la clase Main tiene dependencias hacia las clases Persona, Vehiculo y Destino.

Clase Persona: Esta clase tiene tres atributos: nombre (String), vehiculo (Vehiculo) y destino (Destino). También tiene un método, calcularTiempoLlegada(), que utiliza los atributos vehiculo y destino para calcular el tiempo de llegada al destino. En el diagrama UML, la clase Persona tiene relaciones con las clases Vehiculo y Destino.

Clase Vehiculo: Esta clase tiene dos atributos: tipo (String) y velocidad (int). No tiene métodos propios ni relaciones con otras clases.

Clase Destino:  Esta clase tiene dos atributos: distanciaRespectoOrigen (double) y nombreDestino (String). Al igual que la clase Vehiculo, no tiene métodos propios ni relaciones con otras clases.

foto diagrama UML:
![image](https://github.com/Valehvvv/TareaReceso/assets/142462847/43c09fd1-5d20-4536-bcd6-d53a06ff30bc)


