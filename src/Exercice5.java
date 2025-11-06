import java.util.Scanner;

public class Exercice5 {
    public static void damier (int valeur1) {

        for (int j = 0; j < valeur1; j++) {

            for (int a = 0; a < valeur1; a++) {
                if ((j+a)%2==0){
                    System.out.print("#");
                }
                else {
                    System.out.print("[]");
                }
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entrer la taille du damier voulu");
        int valeur1 = input.nextInt();
        damier(valeur1);
    }
}
