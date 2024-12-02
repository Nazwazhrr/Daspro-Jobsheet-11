import java.util.Scanner;

public class Kubus15 {

    // Data penjualan (5 menu, 7 hari)
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][] penjualan = new int[5][7]; 

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        // Memasukkan data penjualan 
        inputDataPenjualan(input15);   
        tampilkanDataPenjualan();      
        menuTertinggi();               
        rataRataPenjualan();           
    }

    // Fungsi untuk menginputkan data penjualan
    public static void inputDataPenjualan(Scanner scanner) {
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan penjualan untuk menu " + menu[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt(); 
            }
        }
    }

    // Fungsi untuk menampilkan seluruh data penjualan
    public static void tampilkanDataPenjualan() {
        System.out.println("\n=== Data Penjualan ===");
        System.out.printf("%-15s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", 
            "Menu", "Hari 1", "Hari 2", "Hari 3", "Hari 4", "Hari 5", "Hari 6", "Hari 7");
        
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]); 
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-10d", penjualan[i][j]); 
            }
            System.out.println(); 
        }
    }
    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public static void menuTertinggi() {
        int maxPenjualan = 0;
        String menuTerlaris = "";
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > maxPenjualan) {
                maxPenjualan = total;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi adalah '" + menuTerlaris + "' dengan total " + maxPenjualan + ".");
    }
    public static void rataRataPenjualan() {
        System.out.println("\n=== Rata-rata Penjualan Per Menu ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / 7;
            System.out.printf("%-15s: %.2f\n", menu[i], rataRata);
        }
    }
}


