package Reto1.Principal;

import Reto1.Salud.Persona;

public class Inicio{

    public static void main(String[] args) {
        
        Persona dato = new Persona();

        dato.pedirDatos();
        dato.mostrarPersona();
        dato.calcularmlc();
        dato.mayorEdad();

    }
}