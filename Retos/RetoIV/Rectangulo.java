package RetoIV;
import java.util.Scanner;
public class Rectangulo {
   private int base;
  private int altura;
    public Rectangulo(){}
    public Rectangulo(int base, int altura){
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
    float area=base*altura;
    System.out.println("el base del triangulo es:"+base+ " La altura del triangulo es:"+altura+ " el area es: "+area);
}
public void calcularPerimetro(){

} 
}
