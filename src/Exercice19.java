public class Exercice19 {
    public static void reverseTableau () {
        int [] tab = {70,60,50,40,30,20,10};
        for (int i = tab.length-1 ; i >= 0 ; i--) {
            System.out.print( tab [i]  + " ");
        }
    }
    public static void main (String[] args) {
        reverseTableau();
    }
}
