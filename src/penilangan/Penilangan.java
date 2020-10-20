/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilangan;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Penilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Penilangan ---\n");
        
        System.out.println("Macam - Macam Pelanggaran : ");
        System.out.println("1. Tidak menggunakan masker");
        System.out.println("2. Tidak mempunyai SIM");
        System.out.println("3. Tidak mempunyai STNK");
        System.out.print("Masukkan no pelanggaran yang dilakukan : ");
        int pelanggaran = input.nextInt();
        
        if (pelanggaran == 1 || pelanggaran == 2 || pelanggaran == 3){
            switch (pelanggaran) {
                case 1:{
                        System.out.println("\n- Tidak memakai masker mendapatkan denda sebesar Rp. 100.000,-\n");
                        System.out.println("Pelanggar membayar denda?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("Masukkan no pilihan anda : ");
                        int pilihan = input.nextInt();
                        switch (pilihan){
                            case 1: System.out.println("Permasalahan selesai"); break;
                            case 2: System.out.println("Mendapatkan hukuman sosial"); break;
                        }   break;
                    }
                case 2:{
                        System.out.println("\n- Tidak mempunyai SIM mendapatkan denda paling banyak sebesar Rp. 1.000.000,-\n");
                        System.out.println("Pelanggar membayar denda?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("Masukkan no pilihan anda : ");
                        int pilihan = input.nextInt();
                        switch (pilihan){
                            case 1: System.out.println("Permasalahan selesai"); break;
                            case 2: System.out.println("Pelanggar dipidana kurungan paling lama 4 bulan"); break;
                        }   break;
                    }
                default:{
                        System.out.println("\n- Tidak mempunyai STNK mendapatkan denda paling banyak sebesar Rp. 500.000,-\n");
                        System.out.println("Pelanggar membayar denda?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("Masukkan no pilihan anda : ");
                        int pilihan = input.nextInt();
                        switch (pilihan){
                            case 1: System.out.println("Permasalahan selesai"); break;
                            case 2: System.out.println("Pelanggar dipidana kurungan paling lama 2 bulan"); break;
                        }   break;
                    }
            }
        }else
        System.out.println("\nMohon Maaf, Pilihan tidak ditemukan");
        
    }
}
