import geometri.Lingkaran;
import geometri.PersegiPanjang;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Lingkaran
        double radius = 7.5;
        Lingkaran lingkaran = new Lingkaran(radius);

        // Menghitung luas dan keliling Lingkaran
        double luasLingkaran = lingkaran.luas();
        double kelilingLingkaran = lingkaran.keliling();

        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        // Membuat objek PersegiPanjang
        double panjang = 4.0;
        double lebar = 6.0;
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        // Menghitung luas dan keliling PersegiPanjang
        double luasPersegiPanjang = persegiPanjang.luas();
        double kelilingPersegiPanjang = persegiPanjang.keliling();

        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);
    }
}
