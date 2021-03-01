package secoud_week.zadanie3;

public class z3 {
    public static void main(String[] args) {

int wynik=0;
        for(int i = 1; i<=10;i++) {
            for (int j = 1; j <= 10; j++) {
                wynik=i*j;
                if(wynik%2==0){
                    System.out.println(wynik);
                }
                else{
                    System.out.println("X");
                }
            }
        }






    }
}

