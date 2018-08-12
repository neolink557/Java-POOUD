
package javaapplication1;
import java.util.Scanner;

public class Condicionales29 
{
    public static void main(String[] args) {
        char letra;
        System.out.println("Digite una letra minuscula");
        Scanner L= new Scanner(System.in);
        letra=L.next().charAt(0);
        switch (letra)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':System.out.println("Es vocal");break;
            default: System.out.println("NO es vocal");break;
                
        }
    }
    
}
