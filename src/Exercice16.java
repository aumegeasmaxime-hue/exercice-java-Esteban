public class Exercice16 {
    public static void moyenNote () {

        int [] tabNote = {12,10,18,20,15};

        int a = 0;
        int ecart = 0;
        int moyenne = 0;
        for (int z : tabNote) {
            moyenne = ((a += z) / (tabNote.length + 1));
        }
        for (int y :tabNote) {
            ecart = y - moyenne;
            System.out.println("L'ecart entre la moyenne et la note " + y + " est: " + ecart);
        }
        System.out.println("La note moyenne est: " + moyenne);
    }
    public static void main (String[] args) {
        moyenNote();
    }
}
