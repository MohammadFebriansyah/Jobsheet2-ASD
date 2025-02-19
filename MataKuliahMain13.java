public class MataKuliahMain13 {
    public static void main(String[] args) {

        MataKuliah13 matkul1 = new MataKuliah13();
        matkul1.kodeMK = "IF013";
        matkul1.nama = "Algoritma Struktur Data";
        matkul1.sks = 2;
        matkul1.jumlahJam = 30;
        matkul1.tampilkanInformasi();

        matkul1.ubahSKS(4);
        matkul1.tambahJam(4);
        matkul1.kurangiJam(5);
        matkul1.tampilkanInformasi();

        MataKuliah13 matkul2 = new MataKuliah13("IF101", "Pemrograman Dasar", 3, 25);
        matkul2.tampilkanInformasi();


    }
}
