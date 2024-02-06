package kasus3;
import java.util.Scanner;
public class Kasus3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Menghitung Total Belanja
        System.out.print("Harga Barang : ");
        double harga = input.nextDouble();
        System.out.print("Jumlah Barang : ");
        int jumlah = input.nextInt();
        
        double totalBelanja = harga*jumlah;
        
        System.out.print("Besar Pembayaran : ");
        double besarPembayaran = input.nextDouble();
        
        //Mencetak Kembalian
        double kembalian = besarPembayaran - totalBelanja;
        
        System.out.println("Total Belanja : "+ totalBelanja);
        System.out.println("Kembalian : "+ kembalian);
    }
}
