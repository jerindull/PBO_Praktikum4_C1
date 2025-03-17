import java.time.LocalDate;
import java.time.Period;

class Tendik extends Pegawai {
    private String bidangKerja;

    public Tendik() {
        super();
        this.bidangKerja = "";
    }

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidangKerja) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, "Tendik");
        this.bidangKerja = bidangKerja;
    }

    public String getBidangKerja() { 
        return bidangKerja; 
    }

    public void setBidangKerja(String bidangKerja) { 
        this.bidangKerja = bidangKerja; 
    }

    public LocalDate getBUP() {
        LocalDate bup = tanggalLahir.plusYears(45);
        return LocalDate.of(bup.getYear(), bup.getMonth().plus(6), 4);
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
        System.out.println("Bidang Kerja            : " + bidangKerja);
        System.out.println("BUP (Batas Usia Pensiun): " + formatTanggal(getBUP()));
        long masaKerja = super.hitungMasaKerja();
        double tunjangan = 0.01 * masaKerja * gajiPokok;
        System.out.println("Masa Kerja              : " + getMasaKerja());
        System.out.printf("Tunjangan               : 3%% x %d x Rp %d = Rp %d\n", masaKerja, (int) gajiPokok, (int) tunjangan);
    }
}