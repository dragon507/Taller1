package taller_1;

import java.util.Scanner;

public class problema6 {
    Scanner teclado = new Scanner(System.in);

    int prome1,prome2,prome3;
    int prome4,prome5;
    float suma,promedio;

    public void mo (){

        System.out.println(" Ingrese el primer tiempo : ");
        prome1 = teclado.nextInt();

        System.out.println(" Ingresa el segundo tiempo : ");
        prome2 = teclado.nextInt();

        System.out.println(" Ingrese el tercer tiempo : ");
        prome3 = teclado.nextInt();

        System.out.println(" Ingrese el cuarto tiempo : ");
        prome4 = teclado.nextInt();

        System.out.println(" Ingrese el quinto tiempo : ");
        prome5 = teclado.nextInt();

        suma = prome1+prome2+prome3+prome4+prome5;
        promedio = suma / 5;

        System.out.println(" El promedio de tiempo que hace el corredor es de : "+promedio);

    }
}
