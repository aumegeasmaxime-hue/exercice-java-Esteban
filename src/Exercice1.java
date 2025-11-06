public class Exercice1 {
    public static void multipleDeTrois (){

        for (int i = 1 ;i <= 50; i++){
            if ((i % 3)==0) {
                System.out.print(i + " ");
            }
        }

    }


    public static void main (String[] args) {
        multipleDeTrois ();
    }
}
