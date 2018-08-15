
package javaapplication1;
import java.util.Scanner;

public class Recursividad98 
{
    static int potencia(int x,int y)
    {
        if(x==1)
        {
            return y;
        }
        else
        {
            return y*potencia((x-1),y);
        }
    }
    
    
    
    public static void main(String[] args) {
        int x,m,y;
        Scanner p = new Scanner(System.in);
        System.out.println("ingresa la potencia a la que va a elevar");
        x=p.nextInt();
        System.out.println("ingrese el numero a elevar");
        y=p.nextInt();
        m=potencia(x,y);
        
        System.out.println(m);
        
    }
}
