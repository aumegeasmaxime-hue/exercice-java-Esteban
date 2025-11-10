public class Exercice26 {
    public static void mention () {
        int[] tab = {2,14,5,18,16,20,12,10,15,13};
        int tresBien = 0;
        int bien = 0;
        int passable = 0;
        int echec = 0;
        for (int z : tab) {
            if (z >= 16) {
                tresBien++;
            }
            else if (z >= 12) {
                bien++;
            }
            else if (z >= 10) {
                passable++;
            }
            else {
                echec++;
            }
        }
        System.out.println("il y a " + tresBien + " avec la mention tres bien");
        System.out.println("il y a " + bien + " avec la mention bien");
        System.out.println("il y a " + passable + " avec la mention passable");
        System.out.println("il y a " + echec + " avec la mention echec");
    }
    public static void main (String[] args) {
        mention();
    }
}
