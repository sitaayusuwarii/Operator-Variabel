package kasus4;
import java.util.Scanner;
public class Kasus4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("total barang pertama : ");
        int totalBarang = input.nextInt();
        
        System.out.print("Tarif pengiriman barang pertama : ");
        double tarifPengirimanPertama = input.nextDouble();
        
        System.out.print("Total barang selanjutnya : ");
        int TotalBarang = input.nextInt();
        System.out.print("Tarif pengiriman barang selanjutnya : ");
        double TarifPengiriman = input.nextDouble();
        
        int totalbarang = TotalBarang + totalBarang;
        double totalHarga = tarifPengirimanPertama+(TarifPengiriman*
                (TotalBarang-totalBarang));
        
        System.out.println("jumlah total barang : "+ totalbarang);
        System.out.println("Total Harga Pengiriman : "+totalHarga);
    }
}
