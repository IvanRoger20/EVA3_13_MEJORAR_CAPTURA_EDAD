/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_13_mejorar_captura_edad;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_13_MEJORAR_CAPTURA_EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean datoErroneo = true;
        int iedad = 0;
        do{
            try{
                System.out.println("Introduzca su edad(En numero entero): ");
                iedad = sc.nextInt();
                if (iedad < 0)
                    throw new Exception("El valor: " + iedad + " no es una edad válida");
                System.out.println("Tu edad: " + iedad);
                datoErroneo = false;
            }catch (InputMismatchException e){
                System.out.println(sc.next() + " No es un numero valido");
            }catch(Exception e){
                System.out.println("Edad no válida");
            }
        }while(datoErroneo);
    }
    
}
