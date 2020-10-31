/*
@author 
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Tunjangan
 */
package pbo210116397latihan17tunjangan;
import java.util.Scanner;
/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gapok;
        double tunjangan = 0;
        double gaTot ;

        String status;
        String status1 = "Menikah";
        String status2 = "Belum";

        Scanner in = new Scanner(System.in);

        System.out.println("====== Program Tunjangan ======");
        System.out.print("Berapa Gaji Pokok Anda Perbulan?\t: " +"Rp.");
        gapok = in.nextDouble();
        System.out.print("Status Anda?(Menikah/Belum)\t: ");
        status = in.next();
        System.out.println("\n"+"====== Hasil Perhitungan Gaji Anda ======");
        System.out.println("Gaji Pokok\t : Rp. " + gapok);
        if (status.equals(status1)) {
            tunjangan = gapok * 0.35;
            System.out.println("Tunjangan\t : Rp. "  + tunjangan );
        } else {
            System.out.println("Tunjangan\t : Rp. "  + tunjangan );
        }
        gaTot = gapok + tunjangan;
        System.out.println("Total Gaji\t : Rp. "  + gaTot);
        System.out.println("Developed by : Muhammad Azraqi Saputra");
    }
    
}
