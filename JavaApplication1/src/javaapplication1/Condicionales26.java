
package javaapplication1;
import java.util.Scanner;

public class Condicionales26 {
    public static void main(String[] args) {
        int num;
        Scanner n = new Scanner(System.in);
        do
        {
            System.out.println("Digite un numero :");
            num=n.nextInt();
            if(num<=0)
            {
                System.out.println("Ingrese un mvalor entero mayor a cero");
            }
        }while(num<=0);
        if(num%2 == 0)
        {
            System.out.println("Es par");
        }
        else
        {
            System.out.println("Es impar");
        }
    }
}
