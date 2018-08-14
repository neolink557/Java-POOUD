package javaapplication1.newpackage;
import java.util.Scanner;
import java.io.IOException;
public class InterfazUsuarios 
{
    public static void main(String[] args) {
        
        AlumnosEjercicio103 al  = new AlumnosEjercicio103();
        System.out.println("por favor, digite la cantidad de alumnos");
        Scanner sc = new Scanner(System.in);
        int alumnos= sc.nextInt();
        int estudiantes;
        float[] estudiantes1;
        System.out.println("por favor, la cantidad de notas");
        estudiantes=sc.nextInt();
        for(int i=1;i<=alumnos;i++)
        {
            
            System.out.println("por favor, el nombre del alumno " + i);
            al.setNombre(sc.next(),(i));
           for(int c=0;c<estudiantes;c++)
           {
               System.out.println("por favor, digite la nota " + (c+1)+ " del estudiante "+ al.n(i));
                al.setNota_p(sc.nextFloat(),c);
           }
               
               
        }
        
        for(int i=1;i<=alumnos;i++)
        {
            al.promedio(estudiantes);
            System.out.println("el estudiante "+al.n(i)+" tiene un promedio de: "+ al.setNota_f());
        }
    }
}
