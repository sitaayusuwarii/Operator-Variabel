package kasus5;
import java.util.Scanner;
public class Kasus5 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Berat kotak : ");
      double beratKotak = input.nextDouble();
      System.out.print("Jumlah Pembelian Kotak : ");
      int jumlahPembelianKotak = input.nextInt();
      System.out.print("Harga Kopi per Kilo : ");
      double hargaKopi = input.nextDouble();
      
      System.out.print("Pajak : ");
      double pajak = input.nextDouble();
      
     double totalPembayaran = (beratKotak*jumlahPembelianKotak *hargaKopi)+pajak;
     
     System.out.println("totalPembayaran Kopi : "+totalPembayaran); 
    }  
}
