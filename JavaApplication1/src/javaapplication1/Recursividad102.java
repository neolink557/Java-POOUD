
package javaapplication1;
import java.util.Scanner;


public class Recursividad102 {
    static int suma (int x){
        if (x==1){
            return 1;
        }else{
            return x+suma(x-1);
        }
    }
    
    public static void main (String[] args){
        int x,y;
        Scanner X=new Scanner(System.in);
        x=X.nextInt();
        y=suma(x);
        System.out.println(y);
    }
}
