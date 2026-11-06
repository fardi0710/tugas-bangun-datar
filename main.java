// Class utama untuk menghitung bangun datar
class BangunDatar {

    // 1. Method untuk Luas Persegi
    public double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    // 2. Method untuk Keliling Persegi
    public double kelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    // 3. Method untuk Luas Persegi Panjang
    public double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    // 4. Method untuk Keliling Persegi Panjang
    public double kelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    // 5. Method untuk Luas Lingkaran
    public double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    // 6. Method untuk Keliling Lingkaran
    public double kelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }
}

// Class Main untuk menjalankan semua method
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class BangunDatar
        BangunDatar hitung = new BangunDatar();

        System.out.println("=== UJI COBA METHOD BANGUN DATAR ===");

        // Memanggil dan menggunakan semua method persegi
        double sisiPersegi = 5;
        System.out.println("\n[Persegi dengan sisi " + sisiPersegi + "]");
        System.out.println("Luas     : " + hitung.luasPersegi(sisiPersegi));
        System.out.println("Keliling : " + hitung.kelilingPersegi(sisiPersegi));

        // Memanggil dan menggunakan semua method persegi panjang
        double panjang = 6, lebar = 4;
        System.out.println("\n[Persegi Panjang dengan p=" + panjang + ", l=" + lebar + "]");
        System.out.println("Luas     : " + hitung.luasPersegiPanjang(panjang, lebar));
        System.out.println("Keliling : " + hitung.kelilingPersegiPanjang(panjang, lebar));

        // Memanggil dan menggunakan semua method lingkaran
        double r = 7;
        System.out.println("\n[Lingkaran dengan jari-jari " + r + "]");
        System.out.println("Luas     : " + hitung.luasLingkaran(r));
        System.out.println("Keliling : " + hitung.kelilingLingkaran(r));
        
        System.out.println("\n====================================");
        System.out.println("Semua method berhasil digunakan!");
    }
}
