public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi,String warna,String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah sisi : " + getJmlSisi());
        System.out.println("Warna : " + getWarna());
        System.out.println("Border : " + getBorder());
        System.out.println("Sisi : " + sisi);
        System.out.println("");
    }
}