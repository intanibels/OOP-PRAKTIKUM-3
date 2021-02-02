package main;
import java.util.Scanner;
public class Kendaraan {
    //membuat method static
    static void data(){
        //membuat scanner
        Scanner a = new Scanner(System.in);
        //deklarasi variabel
        String jenis, brand, nama, warna;
        int cc, tahun, harga;
        //menerima inputan user
        System.out.println("|     PENGISIAN DATA KENDARAAN     |");
        System.out.println("====================================");
        System.out.print("Masukkan Jenis Kendaraan : ");
        jenis = a.nextLine();
        System.out.print("Masukkan Brand Kendaraan : ");
        brand = a.nextLine();
        System.out.print("Masukkan Nama Kendaraan  : ");
        nama = a.nextLine();
        System.out.print("Masukkan Warna Kendaraan : ");
        warna = a.nextLine();
        System.out.print("Masukkan Keluaran Tahun  : ");
        tahun = a.nextInt();
        System.out.print("Masukkan CC Kendaraan    : ");
        cc = a.nextInt();
        System.out.print("Masukkan harga Kendaraan : ");
        harga = a.nextInt();
        //membuat output terakhir
        System.out.println("|          DATA KENDARAAN          |");
        System.out.println("====================================");
        System.out.println("Jenis Kendaraan : "+jenis);
        System.out.println("Brand Kendaraan : "+brand);
        System.out.println("Nama  Kendaraan : "+nama);
        System.out.println("Warna Kendaraan : "+warna);
        System.out.println("Tahun Keluaran  : "+tahun);
        System.out.println("CC Kendaraan    : "+cc);
        System.out.println("Harga Kendaraan : "+harga);
    }
}