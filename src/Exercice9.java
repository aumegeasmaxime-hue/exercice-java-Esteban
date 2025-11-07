import java.util.Scanner;

public class Exercice9 {
    public static void premier (){
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer un numero :  ");
        int valeur1 = input.nextInt();
        while (valeur1 != 0) {
            if ((valeur1 == 1)||(valeur1 == 3)||(valeur1 == 5)||(valeur1 == 7)){
                System.out.println("Peut-être premier");
                break;
            }
            else if (valeur1 % 2 == 0){
                System.out.println("Pas premier");
                break;
            }
            else if (valeur1 % 3 == 0){
                System.out.println("Pas premier");
                break;
            }
            else if (valeur1 % 5 == 0){
                System.out.println("Pas premier");
                break;
            }
            else if (valeur1 % 7 == 0){
                System.out.println("Pas premier");
                break;
            }

            else {
                System.out.println("Peut-être premier");
                break;
            }
        }
    }
    public static void main (String[] args) {
        premier();
    }
}
