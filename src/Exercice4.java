import java.util.Scanner;

public class Exercice4 {
    public static int factorielle (int valeur1){
        int result = 1;
        for (int i = valeur1 ; i > 0 ; i--){
            result *= i;
        }
    return result;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Donner un nombre pour obtenir sa valeur factorielle");
        int valeur1 = input.nextInt();
        System.out.println(factorielle (valeur1));
    }
}
