import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variabel
        int angka = 5;
        float pecahan = 3.14f;
        char karakter = 'A';
        String nama = "Pulung Aji";
        System.out.println(angka);
        System.out.println(pecahan);
        System.out.println(karakter);
        System.out.println(nama);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int inputAngka = scanner.nextInt();

       
        int[][] arrayMultiDimensi = new int[inputAngka][inputAngka];
        int[] arraySatuDimensi = new int[inputAngka] ;

     
        System.out.println("Angka yang dimasukkan: " + inputAngka);

        // Struktur kontrol: for
        for (int i = 0; i < inputAngka; i++) {
            for(int j=0; j<inputAngka;j++)
            {
                arrayMultiDimensi[i][j]= 10*(i+1);
            }
        }

        System.out.println("Matrix: ");
         for (int i = 0; i < inputAngka; i++) {
            for(int j=0; j<inputAngka;j++)
            {
                System.out.print(arrayMultiDimensi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        if (inputAngka > 0) {
            System.out.println("Angka yang dimasukkan adalah positif.");
        } else if (inputAngka < 0) {
            System.out.println("Angka yang dimasukkan adalah negatif.");
        } else {
            System.out.println("Angka yang dimasukkan adalah nol.");
        }

        int counter = 0;
        while (counter < inputAngka) {
            arraySatuDimensi[counter] = (counter+1) * 10;
            counter++;
        }

        int doWhileCounter = 0;
        System.out.println("Array 1d: ");
        do {
            System.out.print(arraySatuDimensi[doWhileCounter] + " ");
            doWhileCounter++;
        } while (doWhileCounter < inputAngka);
    }
}
