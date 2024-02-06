
package kasus_2;
public class Kasus_2 {

    public static void main(String[] args) {
        
        // Luas Lingkaran dan Keliling Lingkaran
        int jariJari = 14;
        //Luas Segitiga
        int alas = 20;
        int tinggi = 16;
        //Keliling Segitiga
        int a = 5;
        int b = 5;
        int c = 5;
        //Volume Tabung
        int JariJariTabung = 10;
        int Tinggi = 30;
        
        double luasLingkaran = 3.14 * jariJari * jariJari;
        double kelilingLingkaran = 2 * 3.14 * jariJari;
        double luasSegitiga = 0.5*alas*tinggi;
        double kelilingSegitiga = a + b + c;
        double volumeTabung = 3.14*JariJariTabung*JariJariTabung* Tinggi;
        
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.println("Masukkan Jari-jari Lingkaran : "+jariJari);
        System.out.println("Luas Lingkaran : "+luasLingkaran);
        System.out.println("Keliling Lingkaran : "+kelilingLingkaran);
        
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("Masukkan alas : "+alas);
        System.out.println("Masukkan tinggi : "+tinggi);
        System.out.println("Luas Segitiga : "+luasSegitiga);
        
        System.out.println("Menghitung Keliling Segitiga");
        System.out.println("Masukkan Sisi a :"+a);
        System.out.println("Masukkan Sisi b : "+b);
        System.out.println("Masukkan Sisi c : "+c);
        System.out.println("Keliling Segitiga : "+kelilingSegitiga);
        
        System.out.println("Menghitung Volume Tabung");
        System.out.println("Masukkan Jari-Jari Tabung : "+JariJariTabung);
        System.out.println("Masukkan Tinggi Tabung : "+Tinggi);
        System.out.println("Volume Tabung : "+volumeTabung);
                
    }
    
}
