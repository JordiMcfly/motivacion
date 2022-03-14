/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jordi_del_olmo;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class JordiDelOlmo_EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        String numero;
        char cadena[];
        int numeroMax=0,comptador=0;
        
        System.out.println("introdueix un numero ");
        numero = lector.nextLine();
        cadena = numero.toCharArray();
        numeroMax=cadena.length;
         int j = numeroMax;

        for (int i = 0; i < cadena.length; i++) {          
             j--;
        
              if (cadena[i] != cadena[j]){                   
                  System.out.println("el numero "+numero+" no es cap i cua");
                           break;
            }else{
                  comptador++;
              }
              }if (comptador==cadena.length){
                  System.out.println("el numero "+ numero +" si es cap i cua");
              }
              
        }
    }


