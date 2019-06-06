package taller_1;

import java.util.Scanner;

public class problema4 {
    Scanner teclado = new Scanner(System.in);

    String Nom_clie;
    float tota_arti;
    float impues=100;
    float multi=7;
    float tota_fina;
    float total;

    public void most(){

        System.out.println("ingrese el Nombre del Cliente:");
        Nom_clie = teclado.next();

        System.out.println("ingrese el total del valor de los articulos Comprados =");
        tota_arti = teclado.nextFloat();

        total = tota_arti / impues * multi;
        tota_fina = total+tota_arti;

        System.out.println("el Cliente : " + Nom_clie+" pagara un total de = " + tota_fina);

    }
}
