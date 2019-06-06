package taller_1;
import java.util.Scanner;

public class problema1 {
    Scanner keyboard = new Scanner(System.in);

    String Name;

    public void mostrar(){

        System.out.println("Hello--->Welcome To My Workshop #1");
        System.out.print("Enter Your Name:");
        Name = keyboard.next();

        System.out.println("Your Name Is " + Name);
    }


}
