
package javaapplication1;
import java.util.Scanner;
import java.io.*;

public class Archivo110 
{
     public static void main(String[] args)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("E:/programacion/POOUD/prueba.txt");
            pw = new PrintWriter(fichero);
                pw.println("código ASCII0 NULL ( carácter nulo )"+
                            "código ASCII1 SOH ( inicio encabezado )"+
				"código ASCII2 STX ( inicio texto )"+
				"código ASCII3 ETX ( fin de texto )"+
				"código ASCII4 EOT ( fin transmisión )"+
				"código ASCII5 ENQ ( enquiry )"+
				"código ASCII6 ACK ( acknowledgement )"+
				"código ASCII7 BEL ( timbre )"+
				"código ASCII8 BS ( back space o retroceso )"+
				"código ASCII9 HT ( tabulador horizontal )"+
				"código ASCII10 LF ( salto de linea )"+
				"código ASCII11 VT ( tabulador vertical )"+
				"código ASCII12 FF ( form feed )"+
				"código ASCII13 CR ( retorno de carro )"+
				"código ASCII14 SO ( shift Out )"+
				"código ASCII15 SI ( shift In )"+
				"código ASCII16 DLE ( data link escape )"+
				"código ASCII17 DC1 ( device control 1 )"+
				"código ASCII18 DC2 ( device control 2 )"+
				"código ASCII19 DC3 ( device control 3 )"+
				"código ASCII20 DC4 ( device control 4 )"+
				"código ASCII21 NAK ( negative acknowledgement )");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
