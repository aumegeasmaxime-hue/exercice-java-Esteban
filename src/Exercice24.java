public class Exercice24 {
    public static void pairImpair () {
        int[] tab = {2,4,5,8,15,30,22,37,67,12,23,34,45,56};
        int countPair = 0;
        int countImpair = 0;

        for (int z : tab){
            if ((z % 2)== 0) {
                countPair++;
            }
            else {
                countImpair++;
            }
        }
        System.out.println("Il y a " + countPair + " chiffre Pair et " + countImpair + " chiffre Impair");
    }
    public static void main (String[] args) {
        pairImpair();
    }
}
