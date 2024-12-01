import java.util.Scanner;
public class Kafe15 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50") || kodePromo.equals("DISKON50%")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equals("DISKON30") || kodePromo.equals("DISKON30%")) {
            System.out.println("Selamat! Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo tidak valid.");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50") || kodePromo.equals("DISKON50%")) {
            System.out.println("Diskon 50% diterapkan!");
            hargaTotal = hargaTotal - (hargaTotal / 2);
        } else if (kodePromo.equals("DISKON30") || kodePromo.equals("DISKON30%")) {
            System.out.println("Diskon 30% diterapkan!");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada diskon.");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");

        Scanner input15 = new Scanner(System.in);
        int totalKeseluruhan = 0;
        String lanjutkan;
        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = input15.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = input15.nextInt();
            System.out.print("Masukkan kode promo: ");
            String kodePromo = input15.next();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.print("Apakah Anda ingin menambah pesanan lain? (y/n): ");
            lanjutkan = input15.next();
        } while (lanjutkan.equalsIgnoreCase("y"));
        System.out.println("\nTotal keseluruhan pesanan Anda: Rp" + totalKeseluruhan);
    }
}
