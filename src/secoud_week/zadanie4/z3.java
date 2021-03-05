package secoud_week.zadanie4;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class z3 {
    public static void main(String[] args) {
Random rand = new Random();

    String [] Pjes = {"Dog" , "Pies" , "Perro"};

        int rand1 = rand.nextInt(3);



        if(rand1 == 0){
            System.out.println("Imie psa to: " + Pjes[0]);
        }
        if(rand1 == 1){
            System.out.println("Imie psa to: " + Pjes[1]);
        }
        if(rand1 == 2){
            System.out.println("Imie psa to: " +  Pjes[2]);
       }

















//        int rand1 = rand.nextInt(3);
//        System.out.println(rand1);
//
//        if(rand1 == 0){
//            System.out.println("Imie psa to: Dog");
//        }
//        if(rand1 == 1){
//            System.out.println("Imie psa to: Pies");
//        }
//        if(rand1 == 2){
//            System.out.println("Imie psa to: Perro");
//        }






    }
}
