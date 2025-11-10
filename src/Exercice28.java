public class Exercice28 {
    public static void impairTableau () {
        int[] tab1 = {2,4,55,6,37,10,81,15,17};
        int[] tab2 = new int[tab1.length];
        int count = 0;
            for (int z : tab1) {
                if ((z % 2)==1) {
                    tab2 [count] = z;
                    count++;
                }
            }
            for (int y : tab1){
                System.out.print(y + " ");
            }
        System.out.println();
            for (int w : tab2){
                System.out.print(w + " ");
            }
    }
    public static void main (String[] args) {
        impairTableau();
    }
}
