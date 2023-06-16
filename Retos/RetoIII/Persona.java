package RetoIII;
import java.util.Scanner;
public class Persona {
    private String tipoDoc;
    private int numerodoc;
    private String nombres;
    private String apellidos;    

    public Persona() {
    }
    
    public Persona(String tipoDoc, int numerodoc, String nombres, String apellidos) {
        this.tipoDoc = tipoDoc;
        this.numerodoc = numerodoc;
        this.nombres = nombres;
        this.apellidos=apellidos;
    }
    public void registrarPersona(){
        Scanner capturar=new Scanner(System.in);
        System.out.println("Ingrese el tipo de documento ");
		tipoDoc=capturar.next();
        System.out.println("Ingrese el numero de documento");
        numerodoc=capturar.nextInt();
        System.out.println("Ingrese sus nombres");
        nombres=capturar.next();
        System.out.println("Ingrese sus apellidos");
        apellidos=capturar.next();
        
       }
public void mostrarPersona() {
    System.out.println("El tipo  de documento es: "+tipoDoc);
    System.out.println("El número de documento es: "+ numerodoc);
    System.out.println("los nombres ingresados son: "+ nombres);
    System.out.println("los apellidos ingresados son: "+ apellidos);
   }
}
