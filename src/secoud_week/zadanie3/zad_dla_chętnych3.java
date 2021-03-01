package secoud_week.zadanie3;
import java.util.Scanner;


public class zad_dla_chętnych3 {

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj wysokość: ");

        int w = skaner.nextInt();

        for(int i = w; i > 0; i--){
            for(int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int n = 2*(w - i) + 1; n > 0; n--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
