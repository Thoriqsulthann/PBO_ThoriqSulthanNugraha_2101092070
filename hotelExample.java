package utspbo;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class hotelExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        hotel example = new hotel();
        
        String kodePesan,tglPesan,kodePelanggan;
        int jenisKamar;
        double tarif,diskon,total;
        
        System.out.print("Masukkan Kode Pesan : ");
        kodePesan=in.nextLine();
        System.out.print("Masukkan Tanggal Pesan : ");
        tglPesan=in.nextLine();
        System.out.print("Masukkan Kode Pelanggan: ");
        kodePelanggan=in.nextLine();
        System.out.print("Masukkan Jenis Kamar : ");
        jenisKamar=in.nextInt();
        System.out.print("\n\n");
        
        example.setKodePesan(kodePesan);
        example.setTglPesan(tglPesan);
        example.setKodePelanggan(kodePelanggan);
        example.setJenisKamar(jenisKamar);
        
        example.print();
    }
}
