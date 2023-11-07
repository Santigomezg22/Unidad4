/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosbidimensonales;

/**
 *
 * @author Usuario
 */
public class ArreglosBidimensonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [][] letras = new char [3][5];
       char letra = 'a';
      
        for (char i = 0; i <3; i++) {
            for (char j = 0; j <5 ; j++) { 
                letras [i][j] = letra;
                letra++;
            }
                    }
        for (char  i = 0; i < 3; i++) {
            for (char  j = 0; j < 5; j++) {
                System.out.print(letras[i][j] + " ");                
            }
                System.out.println();

        }
    }
    
}
    