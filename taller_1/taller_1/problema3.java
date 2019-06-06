package taller_1;

import java.util.Scanner;

public class problema3 {
    Scanner teclado = new Scanner(System.in);

    /*
    Registro:
    Antonio Gomez
    nacio en 1980
    Registro:
    Maria lopez
    nacio en 2000
    */

    //declaracion de variables
    int año_na;
    int eda=0;
    int año_actu=2019;

    public void mostr (){

        System.out.println("ingrese la edad de nacimiento:");
        año_na = teclado.nextInt();

        //operacion
        eda =año_actu - año_na ;

        System.out.println("tiene la edad de :" + eda+" Años ");
    }


}
