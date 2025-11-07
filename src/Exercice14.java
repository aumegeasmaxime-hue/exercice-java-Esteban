public class Exercice14 {
    public static void valeurTotal (){
        int [] tab1 = {2,4,6,8,10};
        int result = 1;
        for (int i : tab1){
            result *= i;
        }
        System.out.println(result);
    }
    public static void main (String[] args) {
        valeurTotal ();
    }
}
