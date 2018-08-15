package javaapplication1;
import java.util.Scanner;

public class Funciones91 
{
static float doble(int x)
{
    x=x*2;

return x;
}
static float cuadrado(int x)
{
    x=x*x;
    return x;
}
    public static void main(String[] args) 
    {
        System.out.println("ingrese el numero");
        Scanner x = new Scanner(System.in);
        int numero = x.nextInt();
        
        System.out.println(cuadrado(numero)-doble(numero));
    }
}
