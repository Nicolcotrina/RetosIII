package RetoII.Principal;
import RetoII.Salud.Persona;

public class Inicio{

    public static void main(String[] args) {
        
        Persona dato = new Persona();
        dato.pedirDatos();
        String pesoactual = dato.calcularImc();
        if(pesoactual.equals("Pesobajo")){
            System.out.println("Su peso es bajo");
        }else if(pesoactual.equals("Pesoideal")){
            System.out.println("Su peso es ideal");
        }else if(pesoactual.equals("Sobrepeso")){
            System.out.println("Esta en sobrepeso");
        }
}
}