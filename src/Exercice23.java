public class Exercice23 {
    public static void carreTableau () {
        int[] tab = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        int carre = 0;
        for (int z : tab){
            carre = z * z;
            tab [count] = carre;
            count++;
        }
        for (int w : tab){
            System.out.print(w + " ");
        }
    }
    public static void main (String[] args) {
        carreTableau();
    }
}
