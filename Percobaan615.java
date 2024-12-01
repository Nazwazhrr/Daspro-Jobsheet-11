import java.util.Scanner;
public class Percobaan615 {
    static int hitungLuas (int pjg, int lb){
        int Luas = pjg * lb;   
        return Luas; 
    }
    static int hitungVolume (int tinggi, int a, int b){
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang");
        p = input15.nextInt();
        System.out.print("Masukkan lebar");
        l = input15.nextInt();
        System.out.print("Masukkan tinggi");
        t = input15.nextInt();

        hitungLuas(p,l);
        System.out.println("Luas persegi panjang adalah " +  hitungLuas(p,l));
        hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + hitungVolume(t, p, l));
    }
}
