public class ex7 {
    public static void main(String[] args) {
        int[][] matrizA = new int[2][2];

        matrizA[0][0] = 1;
        matrizA[0][1] = 2;
        matrizA[1][0] = 3;
        matrizA[1][1] = 4;

        int diagPrinc= matrizA[0][0] + matrizA[1][1];
        int diagSec= matrizA[0][1] + matrizA[1][0];
        System.out.println(diagPrinc-diagSec);




    }
}

