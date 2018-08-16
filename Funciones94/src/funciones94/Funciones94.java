package funciones94;
import java.util.Scanner;

public class Funciones94 {
    
    static void dia(int x){
        switch (x){
            case 1: System.out.println("31");break;
            case 2: System.out.println("28");break;
            case 3: System.out.println("31");break;
            case 4: System.out.println("30");break;
            case 5: System.out.println("31");break;
            case 6: System.out.println("30");break;
            case 7: System.out.println("31");break;
            case 8: System.out.println("31");break;
            case 9: System.out.println("30");break;
            case 10: System.out.println("31");break;
            case 11: System.out.println("30");break;
            case 12: System.out.println("31");break;
        }
    }
    
    public static void main(String[] args) {
        int a;
        Scanner A= new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 12");
        do{
            a=A.nextInt();
            if (a<0 || a>12){
               System.out.println("Por favor ingrese un numero valido del rango indicado"); 
            } 
        }while(a<0 || a>12);
        dia(a);
    }
}
