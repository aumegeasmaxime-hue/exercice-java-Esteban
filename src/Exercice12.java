import java.util.Scanner;

public class Exercice12 {
    public static void password (){

        String enter = "";

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("entrer le numero de votre choix:  ");
            enter = input.nextLine();
            if ("Avion-21".equals(enter)){
                System.out.println("Mot de passe correct!");
            }
        }
        while (!"Avion-21".equals(enter));
    }
    public static void main (String[] args) {
        password ();
    }
}
