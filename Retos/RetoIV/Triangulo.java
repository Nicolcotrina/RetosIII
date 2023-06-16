package RetoIV;
import java.util.Scanner;
public class Triangulo {
  private int base;
  private int altura;
    public Triangulo(){}
    public Triangulo(int base, int altura){
    super();
    this.base=base;
    this.altura=altura;
    }
    

public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
public void registrarDatos(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Ingrese el valor de la base");
    base=leer.nextInt();
     System.out.println("Ingrese el valor de la altura");
    altura=leer.nextInt();
}
public void calcularArea(){
    float area=base*altura/2;
    System.out.println("el base del triangulo es:"+base+ " La altura del triangulo es:"+altura+ " el area es: "+area);
}
public void calcularPerimetro(){

}  
}
