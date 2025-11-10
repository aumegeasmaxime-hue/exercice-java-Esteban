public class Exercice22 {
    public static void deuxTableau () {
        int[] tab = {2, 4, 15, 8, 15};
        int[] tab2 = new int[tab.length];
        int count = 0;
        for (int z : tab) {
            tab2[count] = z;
            count++;
        }
        for (int y : tab) {
            System.out.print(y + " ");
        }
        System.out.println();
        for (int w : tab2) {
            System.out.print(w + " ");
        }
    }
    public static void main (String[] args) {
        deuxTableau();
    }
}
