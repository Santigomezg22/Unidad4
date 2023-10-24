/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraarreglos;
import java.util.Scanner;

public class CalculadoraArreglos {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);       
     
     double[] valores = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        
     System.out.println("***Bienvenido, elige una opcion***");
    
     System.out.println("1. Sumar**");
     
     System.out.println("2. Multiplicar**");
     
     System.out.println("3. Salir**");
        
        int num = scanner.nextInt();
        
        
        switch (num) {
            case 1:
                double suma = 0;
                for (int i = 0; i < valores.length; i++) {
                    suma += valores[i];
                    System.out.println("La suma es de los valores es:* " + suma);
                }
                break;
            case 2:
                double multiplicacion = 1.0;
                for (int i = 0; i < valores.length; i++) {
                    multiplicacion *= valores[i];
                    System.out.println("La multiplicación de los valores es:* " + multiplicacion);
                }
                break;
            case 3: 
                System.out.println("Salir");
                break;
            default:
               
                System.out.println("***La opcion no es valida***");
                break;

        }
    }

}