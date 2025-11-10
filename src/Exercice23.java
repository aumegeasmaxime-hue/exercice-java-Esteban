public class Exercice23 {
    public static void carreTableau () {
        int[] tab = {2, 4, 5, 8, 15};
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
