import java.util.Scanner;

public class ArrayNilai21 {

    public static void main(String[] args) {
    // Studi Kasus Nilai Mahasiswa di SIAKAD - Meminta Inputan Pengguna untuk Mengisi Elemen Array
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int [10];

        System.out.println("================= INPUT =================");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        System.out.println("\n================= OUTPUT =================");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " Lulus! ");
            } else{
                System.out.println("Mahasiswa ke-" + i + " Tidak Lulus! ");
            }
        }

    sc.close();

    }
}