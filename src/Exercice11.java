import java.util.Scanner;

public class Exercice11 {
    public static void conversion (){

        int choix;
        double valeur1;
        double result = 0;
        boolean a = true;


        do {
            Scanner input = new Scanner(System.in);
            System.out.println("entrer le numero de votre choix: ");
            System.out.println("1-Celsius vers Fahrenheit");
            System.out.println("2-Fahrenheit vers Celsius");
            System.out.println("3-Quitter");

            choix = input.nextInt();
            valeur1 = input.nextInt();


            if (choix == 1){
                result += ((valeur1 * 9/5) + 32);
                return result;
            }
            else if (choix == 2){
                result += ((valeur1 - 32) * 5/9);
                return result;
            }
            else if (choix == 3){
                System.out.println("Fin de programme");
                break;
            }
        }
        while (a == false);
        return 0;
    }

    public static void main (String[] args) {
        System.out.println(conversion());

    }
}
