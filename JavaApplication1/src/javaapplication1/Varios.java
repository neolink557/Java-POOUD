package javaapplication1;
import com.sun.org.apache.bcel.internal.generic.GOTO;
import java.util.Scanner;


public class Varios {
    public static void main(String[] args) {
        int horas,minutos,segundos;
        int horas1,minutos1,segundos1;
        
        Scanner t =new Scanner(System.in);
        System.out.println("ingrese las horas");
        horas=t.nextInt();
        System.out.println("ingrese los minutos");
        minutos=t.nextInt();
        System.out.println("ingrese los segundos");
        segundos=t.nextInt();
        horas1=0;
        minutos1=0;
        segundos1=0;
        
        do
        {
            segundos--;
            if(segundos == 0)
            {
                minutos--;
                segundos=59;
            }
             if(minutos ==  0)
            {
                minutos=59;
                horas--;
            }
             
             System.out.println(horas +" : "+ minutos+segundos);
       
        }while(horas1 != horas);
    }
}

