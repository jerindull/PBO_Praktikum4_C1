import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap() {
        super();
        this.NIDN = "";
    }

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas, "Dosen Tetap");
        this.NIDN = NIDN;
    }

    public String getNIDN() { 
        return NIDN; 
    }

    public void setNIDN(String NIDN) { 
        this.NIDN = NIDN; 
    }

    public LocalDate getBUP() { 
        LocalDate bup = tanggalLahir.plusYears(80);
        return LocalDate.of(bup.getYear(), bup.getMonth().plus(3), 8);
    }

    public String getMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(TMT, sekarang);
        int tahun = period.getYears();
        int bulan = period.getMonths();
        return tahun + " tahun " + bulan + " bulan";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN                    : " + getNIDN());
        System.out.println("BUP (Batas Usia Pensiun): " + formatTanggal(getBUP()));
        System.out.println("Masa Kerja              : " + getMasaKerja());
        long tahunKerja = Period.between(TMT, LocalDate.now()).getYears();
        double tunjangan = 0.02 * tahunKerja * gajiPokok;
        System.out.printf("Tunjangan               : 7%% x %d x Rp %d = Rp %d\n", tahunKerja, (int) gajiPokok, (int) tunjangan);
    }
}