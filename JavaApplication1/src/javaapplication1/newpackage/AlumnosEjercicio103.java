package javaapplication1.newpackage;
public class AlumnosEjercicio103 {
    private String nombre[]=new String[100];
    private float nota_p[]=new float[100];
    private float nota_f;
    public void setNombre(String name,int i)
    {
        this.nombre[i]=name;
    }
    public void setNota_p(float p,int i)
    {
        this.nota_p[i]=p;
    }
    public float setNota_f()
    {
       return this.nota_f;
    }
    public String n(int i)
    {
        return this.nombre[i];
    }
    public void promedio(int i)
    {
        for(int x=0;x<=i;x++)
        {
            this.nota_f=this.nota_f+this.nota_p[x];
            
        }
        this.nota_f=this.nota_f/i;
    }
}
