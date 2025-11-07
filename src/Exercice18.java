import java.util.Scanner;

public class Exercice18 {
    public static void creationTableau () {
        Scanner input = new Scanner(System.in);
        System.out.print("Choisir le nombre de case de votre tableau(maximum 10):  ");
        System.out.println();
        int nbCase = input.nextInt();
        int [] tab = new int[nbCase];
        int a = 0;

        for (int i = 0 ; i < tab.length ; i++) {
            System.out.print("entrer une valeur à entrer dans le tableau :  ");
            int valeur = input.nextInt();
            tab[a] = valeur;
            a++;
        }
        System.out.println("Vous avez entré toutes les valeurs!");
        System.out.print("voici votre tableau: ");
        for(int z :tab) {
            System.out.print(z + " ");
        }
    }
    public static void main (String[] args) {
        creationTableau();
    }
}
