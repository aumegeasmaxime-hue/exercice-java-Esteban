import java.util.Scanner;

public class Exercice9 {
    public static void premier (){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer un numero");
        int valeur1 = input.nextInt();
        boolean a = true;
        while (a) {
            if (valeur1 % 2 == 0){
                System.out.println("Pas premier");
            }
            else if (valeur1 % 3 == 0){
                System.out.println("Pas premier");
            }
            else if (valeur1 % 5 == 0){
                System.out.println("Pas premier");
            }
            else if (valeur1 % 7 == 0){
                System.out.println("Pas premier");
            }
            else {
                System.out.println("Peut-être premier");
            }
        }
    }
    public static void main (String[] args) {
        premier();
    }
}
