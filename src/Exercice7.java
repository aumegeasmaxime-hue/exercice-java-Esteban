import java.util.Scanner;

public class Exercice7 {
    public static void addition (){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer les nombres a additionner");
        System.out.println("Entrer 0 pour obtenir le resultat");
        double valeur1 = input.nextDouble();
        double result = 0.0;
        boolean a = true;
        while(a){
            if (valeur1 != 0){
                result += valeur1;
            }
            else if (valeur1 == 0){
                System.out.println(result);
                break;
            }
            valeur1 = input.nextDouble();
        }
    }
    public static void main (String[] args) {
        addition ();
    }
}
