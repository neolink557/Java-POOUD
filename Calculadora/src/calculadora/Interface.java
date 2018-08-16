package calculadora;
import calculadora.Calculadora;
import java.util.Scanner;

public class Interface {
    public static void main (String[] args){
        Calculadora c = new Calculadora ();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        c.setNumero1(sc.nextInt());
        System.out.println("Ingrese otro numero");
        c.setNumero2(sc.nextInt());
        c.sumar ();
        System.out.println(" La suma es: "+c.getResultado());
        c.restar();
        System.out.println(" La resta es: "+c.getResultado());
        c.multiplicar ();
        System.out.println(" La multiplicacion es: "+c.getResultado());
        c.division ();
        System.out.println(" La division es: "+c.getResultado());
    }
}



