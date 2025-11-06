import java.util.Scanner;

public class Exercice2 {
    public static void fibonacci (int number) {
        int number1 = 0;
        int number2 = 1;
        int suite = 0;

        System.out.print(number1 + " ");
        System.out.print(number2 + " ");
        for (int i = 0 ; i < number ; i++){ //boucle definnisant le nombre iteration
            suite = number1 + number2;
            System.out.print(suite + " ");

            number1 = number2;
            number2 = suite;
        }
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entrer le nombre iteration de la suite de Fibonacci voulu");
        int number = input.nextInt();
        fibonacci(number);
    }
}
