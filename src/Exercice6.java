import java.util.Scanner;

public class Exercice6 {



    public static void jeu (int valeur1){
        Scanner input = new Scanner(System.in);
        boolean a = true;
        int valeur = (int) (Math.random () * 100);
        System.out.println(valeur); // uniquement pour le test
        while (a){
            if (valeur1 > 100){
                System.out.println("Merci de respecter l'énoncé");
            }
            else if (valeur == valeur1) {
                System.out.println("Bravo tu a trouvé!!");
                break;
            }
            else if (valeur < valeur1){
                System.out.println("trop grand essai encore");
            }
            else {
                System.out.println("trop petit essai encore");
            }
            valeur1 = input.nextInt();
        }
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("deviner un numero entre 0 et 100");
        int valeur1 = input.nextInt();
        jeu (valeur1);
    }
}
