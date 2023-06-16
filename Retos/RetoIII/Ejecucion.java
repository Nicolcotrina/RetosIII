package RetoIII;

import RetoIII.Empleado;
import RetoIII.Persona;

public class Ejecucion {
        public static void main(String[] args) {
            //instanciar la clase o crear objeto
            Empleado Persona=new Empleado();
            //invocar o llamar un método
    
            Persona.registrarPersona();
            Persona.registrarEmpleado();
            Persona.mostrarPersona();
            Persona.mostrarEmpleado();

        }
    }
