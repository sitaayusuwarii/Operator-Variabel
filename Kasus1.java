package kasus1;
public class Kasus1 {
    
    public static void main(String[] args) {
        
        String merekHandphone = "Xiaomi";
        String tipeHandphone = "Poco M3";
        String warnaHandphone = "Hitam";
        double hargaHandphone = 2000000;
        double diskonPenjualan = 0.2;
        
        double hargaSetelahDiskon = hargaHandphone - (hargaHandphone * diskonPenjualan);
        
        System.out.println("Merek Handphone : "+merekHandphone);
        System.out.println("Tipe Handphone : "+tipeHandphone);
        System.out.println("Warna Handphone : "+warnaHandphone);
        System.out.println("Harga Handphone : "+ hargaHandphone);
        System.out.println("Diskon Penjualan : "+diskonPenjualan);
        System.out.println("Harga Handphone Setelah Diskon : "+hargaSetelahDiskon);
    }
    
}
