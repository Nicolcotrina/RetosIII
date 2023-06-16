package RetoIV;

import java.util.Scanner;

public class Circulo {
   private double radio;
   private  double pi=3.14;
    public Circulo(){}
    public Circulo(Double radio,  double pi){
    super();
    this.radio=radio;
    }
    public double getRadio() {
    return radio;
}
public void setRadio(Double radio) {
    this.radio = radio;
}  
public void registrarDatos(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Ingrese el valor del radio");
    radio=leer.nextInt();
}
public void calcularArea(){
    double area=pi*radio;
    System.out.println("el radio del circulo es:"+radio+ " el area es: "+area);
}

}
