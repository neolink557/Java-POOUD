package javaapplication1;
import java.util.Scanner;

public class Simples9 {
    public static void main(String[] args) 
    {
        int radio;
        float pi = 3.14f;
        Scanner R = new Scanner(System.in);
        System.out.println("ingrese valor entero positvio para el radio");
     
        do
        {
         radio=R.nextInt();
        if(radio<0)
        {
            System.out.println("ingrese un valor entero positivo");
        }
        else
        {
            System.out.println("Area de la circunferencia "+pi*Math.sqrt(radio));
            System.out.println("Diametro de la circunferencia "+2*pi*radio);
        }
        }while(radio<0);
        
    }
    
}
