public class Exercice13 {
    public static void doubleValeur (){

        int [] tab1 = {1,3,5,7,9};
        int [] tab2 = new int [tab1.length];
        int a = 0;

        for ( int i : tab1) {
            tab2 [a] = i*2;
            a++;
        }
        for (int z : tab2){
            System.out.print(z + " ");
        }
    }
    public static void main (String[] args) {
        doubleValeur ();
    }
}
