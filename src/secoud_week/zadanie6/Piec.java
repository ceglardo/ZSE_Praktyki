package secoud_week.zadanie6;
interface Grill{
    void grill();
}
interface Opiekacz{
    void ciastka();
    void chlep();
}

public class Piec implements Grill, Opiekacz {

        int czas;
        int temp;

        public void wlacz(){
            System.out.println("Lecymy i odpalami piec, temperatura to: " + temp + "na: " + czas + "minut");
        }

        @Override
        public void grill(){
            czas = 4;
            temp= 135;
            wlacz();
        }

        @Override
        public void ciastka(){
            czas = 20;
            temp = 220;
            wlacz();
        }

        @Override
        public void chlep(){
            czas = 60;
            temp = 185;
            wlacz();
        }
    public static void main(String[] args) {

Piec piec = new Piec();

Grill grill = piec;
Opiekacz opiekacz = piec;

grill.grill();
opiekacz.ciastka();
opiekacz.chlep();



    }
}
