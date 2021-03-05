package secoud_week.zadanie4;
import java.util.Arrays;
import java.util.Collections;

public class z2 {
    public static void main(String[] args) {
        String[] tab = {"fff", "bbb", "zzz", "ddd", "eee", "aaa", "nnn", "qqq", "ccc", "mmm"};
        Arrays.sort(tab, Collections.reverseOrder());

        System.out.println("Malejonco: " + Arrays.toString(tab));

    }
}
