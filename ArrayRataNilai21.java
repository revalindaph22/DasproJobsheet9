import java.util.Scanner;

public class ArrayRataNilai21 {

    public static void main(String[] args) {
    // Studi Kasus Nilai Mahasiswa di SIAKAD - Melakukan Operasi Arit,atika terhadap Elemen array 
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int [10];
        int jumlahLulus = 0;
        double total = 0;
        double ratarata;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }
        ratarata = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + ratarata);
        System.out.println("Mahasiswa yang lulus = " + jumlahLulus + " Mahasiswa");
        sc.close();
    }
}