import java.util.Scanner;

public class Exercice8 {
    public static void nombreDeChiffre (){
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer un nombres pour connaitre le nombre de chiffre le composant: ");

        int valeur1 = input.nextInt();
        int length = 0;
        int temp = 1;

        while (temp <= valeur1) {
            length++;
            temp *= 10;
        }
        System.out.print(length);
    }
    public static void main (String[] args) {
        nombreDeChiffre ();
    }
}
