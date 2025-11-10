public class Exercice27 {
    public static void comparaisonTableau () {
        int[] tab1 = {2,4,6,8,10};
        int[] tab2 = {2,4,6,8,10};
        int count = 0;

        for (int z : tab1) {
            for (int y : tab2) {
                if (z == y){
                    count++;
                }
            }
        }
        if (count == tab1.length) {
            System.out.println("les tableaux sont identique");
        }
        else {
            System.out.println("les tableaux sont different");
        }
    }
    public static void main (String[] args) {
        comparaisonTableau();
    }
}
