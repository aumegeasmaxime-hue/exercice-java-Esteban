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
