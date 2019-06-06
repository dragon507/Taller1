package taller_1;

import java.util.Scanner;

public class problema2 {
    Scanner teclado = new Scanner(System.in);

    /*
    Registro:
    Oscar valdes
    nacio en : 1997

    Mario Torres
    nacio en : 1980
    */

    //declaración de variables
    int edad=-0;
    String nombre;
    String apellido;
    int año_naci;
    int año_actu=2019;

    public void mostra(){

        System.out.println("Ingrese el Nombre: ");
        nombre = teclado.next();

        System.out.println("Ingrese su apellido:");
        apellido = teclado.next();

        System.out.println("Ingrese el año en que nacio:");
        año_naci = teclado.nextInt();


        edad = año_actu - año_naci;

        System.out.println(" Su nombre es: "+nombre+" "+apellido+" con la edad: "+edad);
    }

}
