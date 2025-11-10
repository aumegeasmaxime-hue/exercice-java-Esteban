public class Exercice25 {
    public static void temperature () {
        int[] tab = {-2,-4,5,8,15,30,22};
        int a = 0;
        int smallest = 0;
        int hightest = 0;

        for (int w : tab) {
            a += w;
        }
        int tempMoyenne = a / (tab.length + 1);
        System.out.println("la temperature moyenne est: " + tempMoyenne);

        for (int x : tab) {
            if (x < smallest) {
                smallest = x;
            }
        }
        int tempMini = smallest;
        System.out.println("la temperature minimale est: " + tempMini);

        for (int x : tab) {
            if (x > hightest) {
                hightest = x;
            }
        }
        int tempMaxi = hightest;
        System.out.println("la temperature maximale est: " + tempMaxi);
    }
    public static void main (String[] args) {
        temperature();
    }
}
