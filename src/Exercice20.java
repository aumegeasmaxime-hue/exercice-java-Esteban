import java.util.Scanner;

public class Exercice20 {
    public static void rechercheTableau () {

            int [] tab = {2,4,6,8,10,13,15};
            Scanner input = new Scanner(System.in);
            System.out.print("entrer le nombre recherché :  ");
            int nbRecherche = input.nextInt();

            boolean present = false;

            for (int x : tab) {
                if (x == nbRecherche) {
                    System.out.print("le nombre est dans le tableau a la position :  ");
                    present = true;
                }
            }
            if (present == false) {
                System.out.println("le nombre n'est pas dans le tableau");
            }
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] == nbRecherche) {
                    System.out.println(i);
                }
            }
    }


    public static void main (String[] args) {
        rechercheTableau();
    }
}
