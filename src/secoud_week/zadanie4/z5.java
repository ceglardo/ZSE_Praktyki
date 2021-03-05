package secoud_week.zadanie4;
import java.util.Arrays;
import java.util.Collections;

public class z5 {
    public static void main(String[] args) {

        Integer[] tab = {10,20,19,40,666,69,21, 123,3445,1000001, 543,432,12,532,7654,21243,64123,5634,3452,5643};

        Arrays.sort(tab,0,9  );

        for(Integer i=0;i<10; i++){
            System.out.print(tab[i]+ " ");

        }
        Arrays.sort(tab, 10,19, Collections.reverseOrder() );
        for(Integer j=10; j<19; j++){
            System.out.print(tab[j] + " ");
        }










    }
}
