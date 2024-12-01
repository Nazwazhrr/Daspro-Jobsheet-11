public class PengunjungCafe15 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
    
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung");

        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
}
