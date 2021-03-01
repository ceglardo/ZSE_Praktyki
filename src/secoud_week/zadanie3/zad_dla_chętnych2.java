package secoud_week.zadanie3;

public class zad_dla_chętnych2 {
    public static void main(String[] args) {
        int sz = 10, wy = 5;
        System.out.print(" ");
        for(int i =1; i<=sz;i++){
            System.out.print("#");
        }
        System.out.print("\n");
        for(int l=1; l<=wy;l++){
            System.out.print("#");
            for(int k=1; k<=sz;k++){
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.print("\n");

        }
        System.out.print(" ");
        for(int j =1; j<=sz;j++) {
            System.out.print("#");
        }


    }
}
