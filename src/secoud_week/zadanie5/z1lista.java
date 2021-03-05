package secoud_week.zadanie5;
import java.util.ArrayList;
import java.util.Collections;

public class z1lista {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("japko");
        list.add("tuskawka");
        list.add("kremuwka");
        list.add("miensny jesz");
        System.out.println(list + "\n");

        list.add("Pap i jesz");
        System.out.println(list + "\n");

        list.add(1, "Kruszka");
        System.out.println(list + "\n");

        list.remove("miensny jesz");
        System.out.println(list + "\n");

        list.remove(2);
        System.out.println(list + "\n");

        list.set(3, "+1 byczq");
        System.out.println(list + "\n");

        Collections.sort(list);
        System.out.println(list + "\n");

        list.clear();
        System.out.println(list);





    }
}
