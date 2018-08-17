package javaapplication1;
import java.util.Scanner;

public class InterfazEstructura104 {
    public static void main(String[] args) {
       PersonasEstructura104 pe = new PersonasEstructura104();    
       Scanner in = new Scanner(System.in);
       
       for(int i=0;i<5;i++)
        {        
            
	   System.out.println("Datos de la persona numero " + (i+1));
           
           System.out.println("Nombre de la persona " + (i+1));
           
                pe.setnombre(in.next());
           
           System.out.println("Sexo de la persona numero " + (i+1));
           
                pe.setsexo(in.next());
           
           System.out.println("Edad de la persona numero " + (i+1));
           
                pe.setedad(in.nextInt());
                
           System.out.println("Color de pelo de la persona " + (i+1));
           
                pe.setpelo(in.nextLine());
          
           System.out.println("Color de piel de la persona " + (i+1));
           
                pe.setcolor_piel(in.nextLine());
         
           System.out.println("Color de ojos de la persona " + (i+1));
            
                pe.setcolor_ojos(in.nextLine());
           
           System.out.println("Nacionalidad de la persona " + (i+1));
           
                pe.setnacionalidad(in.nextLine());
           
           System.out.println("Telefono de la persona " + (i+1));
                
                pe.settelefono(in.nextInt());
          
        }
    }
}
