import java.util.Scanner;

public class TugasPemilihanPesanan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Pesanan = {
            "Spaghetti Carbonara",
            "Tiramisu",
            "Pizza Margherita",
            "Ravioli",
            "Bruschetta",
            "Focaccia",
            "Arancini",
            "Polenta",
            "Osso Buco",
            "Minestrone"
        };

        String PesananDicari;
        double[] Harga = {55000, 40000, 65000, 60000, 30000, 25000, 45000};

        System.out.println("========== MENU KAFE ITALIANO ==========");
        for (int i = 0; i < Pesanan.length; i++) {
            System.out.printf("%-2d %-20s Rp %.2f%n", (i + 1), Pesanan[i], Harga[i]);
        }

        System.out.print("\nMasukkan nama pesanan yang ingin anda cari : ");
        PesananDicari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < Pesanan.length; i++) {
            if (Pesanan[i].equalsIgnoreCase(PesananDicari)) {
                System.out.printf("Pesanan '%s' tersedia dengan harga Rp %.2f%n", Pesanan[i], Harga[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.printf("Maaf, pesanan '%s' tidak tersedia di menu.%n", PesananDicari);
        }

        sc.close();
    }
}
