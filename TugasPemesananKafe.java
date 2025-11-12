import java.util.Scanner;

public class TugasPemesananKafe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan anda : ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] Pesanan = new String[jumlahPesanan];
        double[] Harga = new double[jumlahPesanan];
        double Total = 0;

        for (int i = 0; i < Pesanan.length; i++) {
            System.out.print("Masukkan nama pesanan (makanan/minuman) ke-" +(i+1)+ " : ");
            Pesanan[i] = sc.nextLine();
        }

        for (int i = 0; i < Harga.length; i++) {
            System.out.print("Masukkan harga makanan/minuman ke-" +(i+1)+ " : ");
            Harga[i] = sc.nextDouble();
        }

        for (int i = 0; i < Harga.length; i++) {
            Total += Harga[i];
        }
        System.out.println("Total harga pesanan : "+ Total);

        System.out.println("\n========== PROGRAM PEMESANAN MAKANAN/MINUMAN CAFE ==========");
        System.out.printf("%-5s %-25s %-10s%n", "No", "Nama Pesanan", "Harga");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-5d %-25s Rp %-10.2f%n", (i + 1), Pesanan[i], Harga[i]);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total harga pesanan : Rp %.2f%n", Total);

        sc.close();
    }
}