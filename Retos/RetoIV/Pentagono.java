package RetoIV;

import java.util.Scanner;

public class Pentagono {
    private double perimetro;
    private double apotema;
  public Pentagono(){}  
  public Pentagono(double perimetro, double apotema){
  super();
    this.perimetro=perimetro;
    this.apotema=apotema;
    }
public double getPerimetro() {
    return perimetro;
}
public void setPerimetro(double perimetro) {
    this.perimetro = perimetro;
}
public double getApotema() {
    return apotema;
}
public void setApotema(double apotema) {
    this.apotema = apotema;
} 
public void registrarDatos(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Ingrese el valor del perimetro");
    perimetro=leer.nextInt();
     System.out.println("Ingrese el valor del apotema");
    apotema=leer.nextInt();
}
public void calcularArea(){
    double area=perimetro*apotema/2;
    System.out.println("el perimetro del pentagono es:"+perimetro+ " El valor del apotema es es:"+apotema+ " el area es: "+area);
}
public void calcularPerimetro(){

} 

  }

