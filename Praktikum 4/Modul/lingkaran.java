public class Lingkaran extends BangunDatar {
    // Atribut
    private double jari;
    private static int counterLingkaran = 0;

    // Konstruktor
    public Lingkaran() {
        this.jari = 0;
        setJmlSisi(0);
        setWarna("Tidak ada");
        setBorder("Tidak ada");
        counterLingkaran++;
    }

    public Lingkaran(double jari, String warna, String border) {
        this.jari = jari;
        setJmlSisi(0);
        setWarna(warna);
        setBorder(border);
        counterLingkaran++;
    }

    // Getter dan Setter
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public static int getCounterLingkaran() {
        return counterLingkaran;
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah sisi : " + getJmlSisi());
        System.out.println("Warna : " + getWarna());
        System.out.println("Border : " + getBorder());
        System.out.println("Jari-jari : " + jari);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
        System.out.println("");
    }

    // Metode main untuk menjalankan program
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7, "Kuning", "Hitam");
        lingkaran.printInfo();

        System.out.println("Jumlah objek Lingkaran yang dibuat: " + Lingkaran.getCounterLingkaran());
    }
}