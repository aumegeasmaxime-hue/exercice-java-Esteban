import java.util.Scanner;

public class Exercice21 {
    public static void repetitionTableau () {
        int [] tab = {2,4,15,8,15,13,15};
        Scanner input = new Scanner(System.in);
        System.out.print("entrer le nombre recherché :  ");
        int nbRecherche = input.nextInt();
        int count = 0;
        boolean present = false;

        for (int x : tab) {
            if (x == nbRecherche) {
                count++;
                present = true;
            }
        }
        if (present == true) {
            System.out.println("le nombre " + nbRecherche + " est present " + count + " fois dans le tableau");
        }
        if (present == false) {
            System.out.println("le nombre n'est pas dans le tableau");
        }
    }
    public static void main (String[] args) {
        repetitionTableau();
    }
}
