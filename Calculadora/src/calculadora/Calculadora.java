
package calculadora;

public class Calculadora {
    private int numero1;
    private int numero2;
    private int resultado;

    public void setNumero1(int valor) {
       
        this.numero1= valor;
    }
    public void setNumero2 (int valor){
        this.numero2=valor;
    } 
    public int getResultado (){
        return this.resultado;
    }
    public void sumar(){
        this.resultado=this.numero1+this.numero2;
    }
    public void restar(){
        this.resultado=this.numero1-this.numero2;
    }
    public void multiplicar(){
        this.resultado=this.numero1*this.numero2;
    }
    public void division(){
        this.resultado=this.numero1/this.numero2;
    }
}

