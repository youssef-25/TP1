public class Tableau {
    public static void main(String[] args) {
        String[] saisons = {"été", "hiver", "automne", "printemps"};
        System.out.println(saisons[2]);
        System.out.println(saisons.length);
        int max = 0;
        int min = 0;
        for (int i = 0; i < saisons.length; i++) {
            System.out.println(saisons[i]);
            int[] nombres = {45, 66, 89, 15, 100};
            max = nombres[0];
            min = nombres[0];
            for (int n : nombres) {
                if (n > max) {
                    max = n;
                }
                if (n < min) {
                    min = n;
                }
            }
        }
        System.out.println("le max des nombres est :" + max);
        System.out.println("le min des nombres est :" + min);

    }}
