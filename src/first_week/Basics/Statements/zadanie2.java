package first_week.Basics.Statements;
import java.sql.SQLOutput;
import java.util.Scanner;

public class zadanie2 {


    public static void main(String[] args) {
        //zadanie 1

    Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj liczbe byq: " + "\n");

        int liczba = skaner.nextInt();

        if(liczba>0) {
            System.out.println("Liczba wienksza od 0");
        }
            else{
                if(liczba<0){
                    System.out.println("Liczba mniejsza od 0 ");
                }
                else{
                    System.out.println("Liczba jest rufna 0 byq");
                }
        }
            //zadanie 2
        System.out.println("Podaj liczbe1 byq: " + "\n");
        int liczba1 = skaner.nextInt();
        System.out.println("Podaj liczbe2 gicie: " + "\n");
        int liczba2 = skaner.nextInt();
        System.out.println("Podaj liczbe3 koleszko: " + "\n");
        int liczba3 = skaner.nextInt();

        if(liczba1>liczba2) {
            if(liczba1>liczba3) {
                System.out.println("Największa liczba to: " + liczba1);
            }
            else {
                System.out.println("Największa liczba to: " + liczba3);
            }
        }
        if(liczba1<liczba2) {
            if(liczba2>liczba3) {
                System.out.println("Największa liczba to: " + liczba2);
            }
            else{
                System.out.println("Największa liczba to: " + liczba3);
            }
        }
        if(liczba1==liczba2){
            if(liczba1<liczba3){
                System.out.println("Największa liczba to: " + liczba3);
            }
            else{
                System.out.println("wszystkie liczby som ruwne.43");
            }
        }

        //zadanie 3
        int koteq = 0;
        String plogin = "tajnehasuo";
        String phaslo = "tajnylogin";

        System.out.println("Podaj login: ");
        String login = skaner.next();

        System.out.println("\n");

        System.out.println("Podaj hasuo");
        String haslo = skaner.next();

        if(login.equals(plogin)){
            koteq= koteq+1;
        }

        if(haslo.equals(phaslo)){
            koteq= koteq+1;
        }

        if(koteq==2){
            System.out.println("Git mordeczka mozesz wejść!");
        }
        else{
            System.out.println("Oj nie, nie byczq, nie wbijesz :( ");
        }

/*      Za trudne, pewnie to trzeba zrobić inaczej ale nie mam pojęcia jak F
        //zadanie 4

        System.out.println("Podaj 1 liczbe: ");
        int l1 = skaner.nextInt();
        System.out.println("podaj 2 liczbe: ");
        int l2 = skaner.nextInt();
        System.out.println("Podaj 3 liczbe: ");
        int l3 = skaner.nextInt();

        if(l1>l2){
            if(l1>l3){
                System.out.println("Jest to kolejność malejąca");
            }
            else{
                System.out.println("Nie ma ustalonej kolejności");
            }
        }
        if(l3>l2){
            if(l2>l1){
                System.out.println("Jest to kolejność rosnąca");
            }
            else{
                System.out.println("Nie ma ustalonej kolejności");
            }
        }
        if(l1>l3){
            if(l2>l3) {
                System.out.println("Jest to kolejnośc malejąca");
            }
            else{
                System.out.println("Nie ma ustalonej kolejności");
            }
        if(l3>l1){
            if(l2>l3){
                System.out.println("Nie ma ustalonej kolejności");
            }
            else{
                System.out.println("Jest to kolejnośc malejąca");
            }


        }

        }

        if(l1==l2){
            System.out.println("Nie ma ustalonej kolejności");
        }
        if(l1==l3){
            System.out.println("Nie ma ustalonej kolejności");
        }
        if(l2==l3){
            System.out.println("Nie ma ustalonej kolejności");
        }




*/




        //zadanie 5

        System.out.println("Podaj pierwszą liczbe: ");
        double duble1 = skaner.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double duble2 = skaner.nextDouble();

        System.out.println("Którą operację chcesz wykonać? (dodawanie wybierz: 1, odejmowanie wybierz: 2 mnożenie wybierz: 3 dzielenie wybierz: 4");
        int znak = skaner.nextInt();
        if(znak==1){
            double wynik = duble1 + duble2;
            System.out.println("Wynik to: " +wynik);
        }
        else {
            if (znak == 2) {
                double wynik2 = duble1 - duble2;
                System.out.println("Wynik to: " + wynik2);
            }
            else{
                if(znak==3) {
                    double wynik3 = duble1 * duble2;
                    System.out.println("Wynik to: " +wynik3);
                }
                else{
                    if(znak==4) {
                        double wynik4 = duble1 / duble2;
                        System.out.println("Wynik to: "+wynik4);
                    }
                    else {
                        System.out.println("Oj byczq -1");
                }
            }
        }

        }




    }
}
