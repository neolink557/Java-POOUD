
package javaapplication1;

import java.time.Clock;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Simples10 {
    public static void main(String[] args)
  {
    
      System.out.println("distancia en km");
      Scanner KM  = new Scanner(System.in);
      Scanner T  = new Scanner(System.in);
      Scanner V = new Scanner(System.in);
      float km,t,velocidad;
      do{ 
        km = KM.nextFloat();
        if(km < 0)
        {
            System.out.println("ingrese un numero positivo");
        }
      }while(km<0);
      
      do
      {
          System.out.println("tiempo en minutos");
          t=T.nextFloat();
          if(t<0)
          {
              System.out.println("ingrese un numero positivo");
          }
      }while(t<0);
      
      velocidad=km/t;
      System.out.println("La velocidad del proyectil es :"+velocidad+"m/s");
  }  
}
