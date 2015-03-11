/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosperfectosgit;

/**
 *
 * @author papa
 */
public class Negocio {
    public static boolean esPerfecto(int n){
        int i;
        int suma=0;
        for (i = 1; i < n; i++) { // i son los divisores. Se divide desde 1 hasta n-1
            if (n % i == 0) {
                suma = suma + i; // si es divisor se suma
            }
        }
        return suma == n;
    }
}
