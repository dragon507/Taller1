package taller_1;

import java.util.Scanner;

public class problema5 {
    Scanner teclado = new Scanner(System.in);

    int codi;
    String descrip;
    float tot;
    float impuesto=100;
    float mult = 30;
    float por=7;
    float to_cop;
    float gana;

    public void mos (){
       System.out.println("ingrese el codigo del articulo");
       codi = teclado.nextInt();

       System.out.println("Ingrese la descripcion del articulo : ");
       descrip = teclado.next();

       System.out.println("ingrese el valor de compra del articulo");
       tot = teclado.nextFloat();

       to_cop = tot / impuesto * por;
       to_cop = to_cop + tot;
       gana = to_cop / impuesto * mult;
       gana = gana + to_cop;

       System.out.println(" el Codigo "+codi+" con la descripcion: "+descrip+" Tiene un Total de = "+to_cop);
       System.out.println("");
       System.out.println(" Tendra Que Vender el articulo a = "+gana+" si quiere ganar el 30% del precio del Articulo");

    }
}
