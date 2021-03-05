package secoud_week.zadanie5;
import java.util.Arrays;

public class z1 {
    public static void main(String[] args) {

        int[][] tab = new int[5][5];
        int value = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               tab[i][j] = value;
              value = value+5;
               System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
