package secoud_week.zadanie3;

public class zad_dla_chętnych1 {

    public static void main(String[] args) {

int w= 10;

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
