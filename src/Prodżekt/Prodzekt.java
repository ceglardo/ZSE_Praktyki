package Prodżekt;
import java.util.Scanner;
/*
Autorzy:
-Maciek Cegielny
-Tymoteusz Heldt

Czas pracy ~3.5 godziny


Program: "Kox Kalkulator"
Będzie wykonywać takie działąnia jak:
-Dodawanie
-Odejmowanie
-Dzielenie
-Mnożenie
-Pierwiastkowanie
-Potęgowanie
-Obliczanie Sinusa, Cosinusa, Tangensa i Cotangesns
-Silnia
-Obliczanie pola kwadratu
-Obliczanie pola prostokąta
-Obliczanie pola trójkąta
-Obliczanie pola trójkąta równobocznego
-Obliczanie pola kołą
-Obliczanie pola trapezu
-Obliczanie pola równoległoboku
-Obliczanie pola rombu
-Obliczanie objętości sześcianu
-Obliczanie objętości prostopadłościanu
-Obliczanie objętości graniastosłupa
-Sprawdza czy trójkąt jest pitagorejskim

Cytaty podczas pracy:
"Oni nas zabiją" ~Ąutor nieznany 2k21

"A czyli jednak else musi być wszędzie"

">Czemu nie działa?
>No kurcze niewiem"

"Czemu to nie działa?"

"Później"

"DLACZEGO TO NIE DZIAŁA?"

"Ara ara" ~Autor: Tymeq (XD?????)

"Czy jak nie umiemy procentów w javie to mamy napisać do typków od javy czy pani od matmy?"

"Co my w ogóle robimy?"

"Czemu to nie działą?"

"Pewnie nawet nie przeczytają cytatów"

"A teraz pewnie specjalnie w wiadomości napiszą żę jednak przeczytali"

"Ej tego nie miałeś pisać"

"*dziwne odgłosy siorbania*"

"Ej to wcale nie tak że ja tu nic nie robie" ~Autor nieznany 2k21

"Co to są kurcze algorytmy?"

"Pa tera *łączy else z if*"

"Czy mogę już wrócić do Cyberpunka?"

"Dawaj jeszcze dodamy obwody"

"Im zabraknie skali na punkty dla nas"

"Co to jest trapez?"
" *Nie wie co to kolejność działa*
>Ale wiesz że my jesteśmy w 2 techników na rozszerzonej matmie?"

"Czemu to niedziała?"

"A * niech będzie"

"Co to jest ten x?" x - tu wstaw cokolwiek związanego z javą/matmą

"Daj pitagorejski bo to skomplikowane nazewnictwo"

"A czekaj, głupi jestem"

"To moze cos jeszcze komplikujemy?"

" *klika wytnij zamiast kopiuj i usuwa cały kod*
*dziwięk zarzynanego pterodaktyka*"





Miejsce na notki sprawdzających:
-
-
-
-
-

 */

public class Prodzekt {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println(
                "Wybierz jakie działanie chcesz wykonać: " +
                        "1.Dodawanie " +
                        "2.Odejmowanie " +
                        "3.Mnożenie " +
                        "4.Dzielenie " +
                        "5.Procent z liczby " +
                        "6.Pierwiastkowanie " +
                        "7.Potęgowanie " +
                        "8.Obliczanie Sinusa, Cosinusa, Tangensa i Cotangesns " +
                        "9.Silnia " +
                        "10.Obliczanie pola kwadratu" +
                        "11.Obliczanie pola prostokąta" +
                        "12.Obliczanie pola trójkąta" +
                        "13.Obliczanie pola trójkąta równobocznego" +
                        "14.Obliczanie pola kołą" +
                        "15.Obliczanie pola trapezu" +
                        "16.Obliczanie pola równoległoboku" +
                        "17.Obliczanie pola rombu" +
                        "18.Obliczanie objętości sześcianu" +
                        "19.Obliczanie objętości prostopadłościanu" +
                        "20.Twierdzenie pitagorasa " );
        int Opcja = skaner.nextInt();

        if (Opcja == 1) {
            System.out.println("Ile cyfr chcesz dodać?: ");
            int ile = skaner.nextInt();
            int wynik=0;
            int liczba;
            for(int a=0; a<ile;a++){
                System.out.println("Podaj liczbe: ");
                liczba = skaner.nextInt();
                wynik=wynik+liczba;
            }
            System.out.println("Wynik dodawania to: " + wynik);

        }
        else if(Opcja == 2){
            System.out.println("Od jakiej liczby chcesz zacząć odejmowanie?");
            int wynik = skaner.nextInt();
            System.out.println("Ile cyfr chcesz odjąć?: ");
            int ile = skaner.nextInt();
            int liczba;
            for(int a=0; a<ile;a++){
                System.out.println("Podaj liczbe: ");
                liczba = skaner.nextInt();
                wynik=wynik-liczba;
            }
            System.out.println("Wynik odejmowania to: " + wynik);


        }
        else if(Opcja==3){
            System.out.println("Ile cyfr chcesz pomnożyć?: ");
            int ile = skaner.nextInt();
            int wynik=1;
            int liczba;
            for(int a=0; a<ile;a++){
                System.out.println("Podaj liczbe: ");
                liczba = skaner.nextInt();
                wynik=wynik*liczba;
            }
            System.out.println("Wynik mnożenia to: " + wynik);


        }
        else if(Opcja==4){

            int wynik;
            System.out.println("Podaj pierwszą liczbe: ");
            int a = skaner.nextInt();
            System.out.println("Podaj drugą liczbe: ");
            int b = skaner.nextInt();
            if(a==0 || b==0){
                System.out.println("Pamiętaj programisto młody, nigdy nie dziel przez 0");
            }
            wynik=a/b;
            System.out.println("Wynik dzielenia to: " + wynik);
        }
        else if(Opcja==5){
            System.out.println("Podaj liczbe: ");
            double a = skaner.nextInt();
            System.out.println("Podaj jaki chcesz procent z tej liczby: ");
            double b = skaner.nextInt();
            double wynik;
           wynik= (a/100)*b;
            System.out.println("Procent z tej liczby to: " + wynik);
        }
        else if(Opcja==6){
            System.out.println("Jaką liczbe chcesz spierwiastkować?: ");
            int a= skaner.nextInt();
            double wynik = Math.sqrt(a);
            System.out.println("Pierwiastek z tej liczby to: " + wynik);
        }
        else if(Opcja==7){
            System.out.println("Jaką liczbe chcesz spotęgować?: ");
            int a= skaner.nextInt();
            System.out.println("Do jakiej potęgi chcesz ją podnieść: ");
            int b= skaner.nextInt();
            double wynik = Math.pow(a , b);
            System.out.println("Wynik potęgowania to: " + wynik);
        }
        else if(Opcja==8){
            System.out.println("Podaj a: ");
            double a = skaner.nextInt();
            System.out.println("Podaj b: ");
            double b = skaner.nextInt();
            System.out.println("Podaj c: ");
            double c = skaner.nextInt();

            double sin = a/c ;
            double cos = b/c;
            double tg = a/b ;
            double ctg = b/a;
            System.out.println("Sinus wynosi: "+ sin + " Cosinus wynosi: " + cos + " Tangens wynosi: " + tg + " Cotangens wynosi: " + ctg);
        }
        else if(Opcja==9){
            System.out.println("Podaj cyfre: ");
            int a = skaner.nextInt();
            int wynik=1;
            for(int i=1;i<=a;i++){
                wynik*=i;
            }
            System.out.println("Wynik to: " + wynik );
        }
        else if(Opcja==10){
            System.out.println("Podaj bok kwadratu: ");
            int a = skaner.nextInt();
            double wynik= Math.pow(a , 2);
            System.out.println("Pole kwadratu wynosi: " + wynik);
        }
        else if(Opcja==11){
            System.out.println("Podaj pierwszy bok prostokąta: ");
            int a = skaner.nextInt();
            System.out.println("Podaj drugi bok prostokąta: ");
            int b = skaner.nextInt();
            int wynik=a*b;
            System.out.println("Pole tego prostokąta wynosi: " + wynik);
        }
        else if(Opcja==12){
            System.out.println("Podaj podstawe trójkąta: ");
            int a = skaner.nextInt();
            System.out.println("Podaj wysokość trójkąta: ");
            int h = skaner.nextInt();
            int wynik= a*h/2;
            System.out.println("Pole tego trójkąta wynosi: " + wynik);
        }
        else if(Opcja==13){
            System.out.println("Podaj podstawe tego trójkąta: ");
            int x = skaner.nextInt();
            double sqrt = Math.sqrt(3);
            double a = Math.pow(x , 2);
            double pole = a * sqrt /4;
            System.out.println("Pole tego trójkąta wynosi: " + pole);
        }
        else if(Opcja==14){
            double pi = 3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948954930381964428;
            System.out.println("Podaj promień koła: ");
            int r = skaner.nextInt();
            double r2 = Math.pow(r,2);
            double wynik=r2*pi;
            System.out.println("Pole koła wynosi: " + wynik);
        }
        else if(Opcja==15){
            System.out.println("Podaj pierwsza podstawe trapezu: ");
            int a = skaner.nextInt();
            System.out.println("Podaj drugą podstawe trapezu: ");
            int b = skaner.nextInt();
            System.out.println("Podaj wysokośc trapezu: ");
            double h = skaner.nextInt();
            double wynik = (a+b)*h/2;
            System.out.println("Pole tego trapezu: " + wynik);
        }
        else if(Opcja==16){
            System.out.println("Podaj podstawe równoległoboku: ");
            int a = skaner.nextInt();
            System.out.println("Podaj wysokość równoległoboku: ");
            int h = skaner.nextInt();
            int wynik= a*h;
            System.out.println("Pole tego równoległoboku wynosi: " + wynik);
        }
        else if(Opcja==17){
            System.out.println("Podaj pierwszą przekątną rombu: ");
            int a = skaner.nextInt();
            System.out.println("Podaj drugą przekątną rombu: ");
            int h = skaner.nextInt();
            int wynik= a*h/2;
            System.out.println("Pole tego rombu wynosi: " + wynik);
        }
        else if(Opcja==18){
            System.out.println("Podaj bok kwadratu: ");
            int a = skaner.nextInt();
            double wynik= Math.pow(a , 3);
            System.out.println("Objętość sześcianu wynosi: " + wynik);
        }
        else if(Opcja==19){
            System.out.println("Podaj pierwszy bok podstawy prostopadłościanu: ");
            int a = skaner.nextInt();
            System.out.println("Podaj drugi bok podstawy prostopadłościanu: ");
            int b = skaner.nextInt();
            System.out.println("Podaj wysokość prostopadłościanu: ");
            int h = skaner.nextInt();
            int wynik=a*b*h;
            System.out.println("Objętość tego prostopadłościanu wynosi: " + wynik);
        }
        else if(Opcja==20){
            System.out.println("Podaj pierszą przyprostokątną: ");
            int a = skaner.nextInt();
            System.out.println("Podaj drugą przyprostokątną: ");
            int b = skaner.nextInt();
            System.out.println("Podaj przeciwprostokątną: ");
            int c = skaner.nextInt();

            double a2 = Math.pow(a,2);
            double b2 = Math.pow(b,2);
            double c2 = Math.pow(c,2);
            boolean twierdzenie = a2+b2==c2 ;
            if(twierdzenie){
                System.out.println("Trójkąt jest trókątem P I T A G O R A J S K I M");
            }
            else{
                System.out.println("Ten trójkąt nie jest P I T A G O R A J S K I");
            }


        }
         else {
                System.out.println("Zła opcja");
            }
    }
}
