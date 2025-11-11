import java.util.Scanner;

public class ArrayRataNilai21 {

    public static void main(String[] args) {
    // Studi Kasus Nilai Mahasiswa di SIAKAD - Melakukan Operasi Arit,atika terhadap Elemen array 
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int [jumlahMhs];
        int jumlahLulus = 0, jumlahTidakLulus = 0;
        double ratarata1 = 0, ratarata2 = 0;
        double totalLulus = 0, totalTidakLulus=0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
                totalLulus += nilaiMhs[i];    
            } else {
                jumlahTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        ratarata1 = totalLulus/jumlahLulus;
        ratarata2 = totalTidakLulus/jumlahTidakLulus;
        System.out.println("Rata-rata nilai lulus = " + ratarata1);
        System.out.println("Rata-rata nilai tidak lulus = " + ratarata2);
        
        sc.close();
    }
}