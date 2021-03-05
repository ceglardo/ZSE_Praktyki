package secoud_week.zadanie4;
import java.util.Random;

public class z4 {
    public static void main(String[] args) {
        Random rand = new Random();

        String[] Jedzonko = {"Miensny Jeż", "Zupa Knorr", "nic", "Jajco", "Kremówka", "Slonska potrowo", "Czarnucha(ćasto)", "Słoik nuteli", "Masło"};

        int rand1 = rand.nextInt(9);
        int rand2 = rand.nextInt(9);
        int rand3 = rand.nextInt(9);

        System.out.print("Na śniadanie:" + Jedzonko[rand1] + "\n Na łobiod: " + Jedzonko[rand2] + "\n Na kolacyje: " + Jedzonko[rand3] );



    }
}
