import java.util.Scanner;

public class Exercice10 {
    public static void menu (){
        boolean a = true;
        int valeur1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("entrer le numero pour faire votre choix:  ");
            System.out.print("1-Dire Bonjour   ");
            System.out.print("2-Dire Au revoir   ");
            System.out.print("3-Dire Quitter  :  ");
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
        while (a);
    }
    public static void main (String[] args) {
        menu ();
    }
}
