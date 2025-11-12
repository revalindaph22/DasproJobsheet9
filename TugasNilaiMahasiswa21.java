import java.util.Scanner;

public class TugasNilaiMahasiswa21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== PENYIMPANAN & PENGELOLAAN NILAI MAHASISWA ====");
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        int totalNilai = 0;
        double RataMhs = 0;
        int nilaiMhsTinggi = 0, nilaiMhsRendah = 100;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" +(i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        System.out.println("\n========= DAFTAR NILAI MAHASISWA =========");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " : " + nilaiMhs[i]);
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            totalNilai += nilaiMhs[i];
        }

        RataMhs = (double) totalNilai / nilaiMhs.length;
        System.out.println("\n========== RATA-RATA ==========");
        System.out.println("Rata-rata nilai Mahasiswa : " + RataMhs);

        System.out.println("\n===== TERTINGGI & TERENDAH =====");
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiMhsTinggi) {
                nilaiMhsTinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiMhsRendah) {
                nilaiMhsRendah = nilaiMhs[i];
            }
        }
        System.out.println("Nilai Mahasiswa tertinggi : " + nilaiMhsTinggi);
        System.out.println("Nilai Mahasiswa terendah : " + nilaiMhsRendah); 

        sc.close();
    }
}