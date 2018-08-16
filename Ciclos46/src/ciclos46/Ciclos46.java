
package ciclos46;
import java.util.Scanner;

public class Ciclos46 {

    public static void main(String[] args) {
        int acum= 0, n , y;
        System.out.println("Digite la cantidad de numeros a calcular la media ");
        Scanner Y= new Scanner(System.in);
        y= Y.nextInt();
        Scanner N= new Scanner(System.in);
        
        for(int x=0;x<y;x++)
        {
            System.out.println("Ingrese el numero "+(x+1)+" de "+y);
            n= N.nextInt();
            acum+=n;
        }
        System.out.println("La media de los "+y+" numeros ingresados es:"+acum/y);
    }
    
}
