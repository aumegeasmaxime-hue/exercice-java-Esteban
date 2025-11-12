public class Exercice15 {
    public static void findSmallNum () {

        int[] tab1 = {-1, 4, -5, 10, -8, 6, 8, 7};
        int smallest = 0;
        for (int x : tab1) {
            if (x < smallest) {
                smallest = x;
            }
        }
        System.out.println(smallest);

        for (int i = 0 ; i < tab1.length ; i++){
            if (tab1 [i] == smallest ){
                System.out.println(i);
            }
        }
    }
    public static void main (String[] args) {
        findSmallNum ();
    }
}
/* // code Tamara
static void main(String[] args) {

    int[] nombres = { -3, 1, -7, 2, -11, 9, 13, -5};
    int[] resultat = trouverMin(nombres); // metoda za najmanji broj u nizu
    System.out.println("Le plus petit nombre est : " + resultat[0]);
    System.out.println("Son index dans le tableau est : " + resultat[1]);

}

public static int [] trouverMin(int[] tableau) {

    int min = tableau[0];
    int position = 0;

    for (int i = 1; i < tableau.length; i++) {
        if (tableau[i] < min) {
            min = tableau[i];
            position = i;
        }
    } return new int[] {min, position};
}
 */