public class Exercice17 {
    public static void positifNegatifNull () {
        int [] tab = {10,-9,8,7,-6,0,-2,15,-20,50};
        int countPositif = 0;
        int countNull = 0;
        int countNegatif = 0;
        for (int z :tab){
            if (z > 0) {
                countPositif++;
            }
            else if (z < 0) {
                countNegatif++;
            }
            else if (z == 0) {
                countNull++;
            }
        }
        System.out.println("il y a " + countPositif + " nombres positif");
        System.out.println("il y a " + countNegatif + " nombres negatif");
        System.out.println("il y a " + countNull + " nombres null");
    }
    public static void main (String[] args) {
        positifNegatifNull();
    }
}
