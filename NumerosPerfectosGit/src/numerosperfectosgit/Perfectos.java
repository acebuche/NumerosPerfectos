/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosperfectosgit;

import java.util.Scanner;

/**
 *
 * @author papa
 */
public class Perfectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n = sc.nextInt();

        if (Negocio.esPerfecto(n)) { // si el numero es igual a la suma de sus divisores es perfecto
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }
}
