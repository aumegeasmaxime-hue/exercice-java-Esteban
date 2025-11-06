import java.util.Scanner;

public class Exercice3 {
        public static void tableDeMultiplication (){
            Scanner input = new Scanner(System.in);
            System.out.println("choisir la table de multiplication");
            int valeur1 = input.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.print(i * valeur1 + " ");
            }
    }
    public static void main (String[] args) {
        tableDeMultiplication ();
    }
}
