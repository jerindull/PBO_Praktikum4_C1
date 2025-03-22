public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public void setJmlSisi (int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    
    public double  getJmlSisi(){
        return jmlSisi;
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar:" + counterBangunDatar);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder () {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }


    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }
}