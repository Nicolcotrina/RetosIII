package Reto1.Salud;
import java.util.Scanner;

public class Persona {
    
    //Atributos 
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private double edad;
    private String sexo;

    //Metodos 
    public void pedirDatos(){
        Scanner capturar=new Scanner(System.in);
        System.out.println("Ingrese el tipo de documento ");
        tipoDoc=capturar.next();
        System.out.println("Ingrese el número de documento  ");
        documento=capturar.nextInt();
        System.out.println("Ingrese  nombre ");
        nombre=capturar.next();
        System.out.println("Ingrese  apellido ");
        apellido=capturar.next();
        System.out.println("Ingrese el peso ");
        peso=capturar.nextDouble();
        System.out.println("Ingrese estatura ");
        estatura=capturar.nextDouble();
        System.out.println("Ingrese la edad ");
        edad=capturar.nextInt();
        System.out.println("Ingrese el sexo ");
        sexo=capturar.next();
        capturar.close();
    }

    public void mostrarPersona(){
        System.out.println("El tipo de documento de la persona es: "+tipoDoc);
        System.out.println("El número de documento de la persona es: "+documento);
        System.out.println("El nombre  de la persona es: "+nombre);
        System.out.println("El  apellido de la persona es: "+apellido);
        System.out.println("El  peso de la persona es: "+peso);
        System.out.println("La estatura de la persona es: "+estatura);
        System.out.println("La edad de la persona es: "+edad);
        System.out.println("El  sexo de la persona es: "+sexo);
    }

    public void calcularmlc(){
        double pesoactual= peso/Math.pow(estatura,2);
        System.out.println("Su peso actual es:"+pesoactual);

        if(pesoactual<20){
            System.out.println("El peso esta por debajo de lo ideal");
        }
        else if(pesoactual<20&&pesoactual>=25){
            System.out.println("El peso es ideal");
        }
        else if(pesoactual>25){
            System.out.println("Tiene sobrepeso");
        }
    }

        public void mayorEdad(){

            if(edad>18){
                System.out.println("Usted es mayor de edad");
            }
            else{
                System.out.println("Usted es menor de edad");  
            }
    }
}
