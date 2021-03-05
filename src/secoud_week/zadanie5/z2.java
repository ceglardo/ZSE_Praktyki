package secoud_week.zadanie5;

public class z2 {
    public static void main(String[] args) {

        int[][][][] tab = new int[3][3][3][3];
        int value = 0;
        for(int i=0 ; i < 3 ; i++){
            for(int j = 0; j<3; j++){
                for(int n= 0; n<3;n++){
                    for(int b=0; b<3;b++){
                        tab[i][j][n][b] = value;
                        value= value +1;
                        System.out.println("[" + i + "]["+ j + "][" + n + "][" + b + "] = " + tab[i][j][n][b] + "\t" );

                    }
                    System.out.println();
                }
                System.out.println();
            }
        }





    }
}
