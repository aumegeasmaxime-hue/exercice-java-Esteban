import java.util.Scanner;

public class Exercice10 {
    public static void menu (){

        int valeur1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("entrer le numero pour faire votre choix: ");
            System.out.println("1-Dire Bonjour");
            System.out.println("2-Dire Au revoir");
            System.out.println("3-Dire Quitter");
            valeur1 = input.nextInt();

            if (valeur1 == 1) {
               System.out.println("Bonjour!!");
            }
            else if (valeur1 == 2) {
               System.out.println("Au revoir!!");
            }
            else if (valeur1 == 3) {
               System.out.println("Vous venez de quitter le programme.");
               break;
            }
        }
        while ((valeur1 == 0) || (valeur1 > 3));
    }
    public static void main (String[] args) {
        menu ();
    }
}
