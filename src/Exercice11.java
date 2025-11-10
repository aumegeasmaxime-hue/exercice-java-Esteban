import java.util.Scanner;

public class Exercice11 {
    public static void conversion (){

        int choix;
        double valeur1;
        double result = 0;
        boolean a = true;


        do {
            Scanner input = new Scanner(System.in);
            System.out.print("entrer le numero de votre choix:  ");
            System.out.print("1-Celsius vers Fahrenheit  ");
            System.out.print("2-Fahrenheit vers Celsius  ");
            System.out.println("3-Quitter");
            choix = input.nextInt();

            if (choix == 1){
                System.out.print("entrer la valeur:  ");
                valeur1 = input.nextInt();
                result += ((valeur1 * 9/5) + 32);
                System.out.println("temperature en celsius: " + result);
                a = false;
            }
            else if (choix == 2){
                System.out.print("entrer la valeur:  ");
                valeur1 = input.nextInt();
                result += ((valeur1 - 32) * 5/9);
                System.out.println("temperature en Fahrenheit: " + result);
                a = false;
            }
            else if (choix == 3){
                System.out.println("Fin de programme");
                break;
            }
        }
        while (a == false);
    }
    public static void main (String[] args) {
        conversion();
    }
}
