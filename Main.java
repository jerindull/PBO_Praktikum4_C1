import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // Membuat objek DosenTetap 
        DosenTetap dosenTetap = new DosenTetap("197907202003121002", "987654321", "Nurdin Bahtiar S.Si., M.T.",
            LocalDate.of(1970, 01, 25),
            LocalDate.of(2004, 04, 18), 9500000, "Fakultas Sains & Matematika");
        
        System.out.println("=== Informasi Dosen Tetap ===");
        dosenTetap.printInfo();
        System.out.println();

        // Membuat objek DosenTamu 
        DosenTamu dosenTamu = new DosenTamu("197306101998021001", "344590876", "Prof. Akhmad Syakir Kurnia S.E., M.Si., Ph.D.",
            LocalDate.of(1991, 02, 26),
            LocalDate.of(2025, 05, 17), 3100000, "Fakultas Ekonomi Bisnis", 24);
        
        System.out.println("=== Informasi Dosen Tamu ===");
        dosenTamu.printInfo();
        System.out.println();

        // Membuat objek Tendik 
        Tendik tendik = new Tendik("199208102024081991", "Aris Munandar", 
            LocalDate.of(1989, 3, 30), 
            LocalDate.of(2019, 04, 13), 1500000, "Pengolah Data Pengelolaan Keuangan"); 
       
        System.out.println("=== Informasi Tendik ===");
        tendik.printInfo();
        System.out.println();
    }
}