public class MahasiswaMain13 {
    public static void main(String[] args) {
        Mahasiswa13 mhs1 = new Mahasiswa13();
        mhs1.nama = "Mohammad Febriansyah";
        mhs1.nim = "244107060117";
        mhs1.kelas = "SIB 1B";
        mhs1.ipk = 3.79;

        mhs1.tampilkanInformasi ();
        mhs1.ubahKelas ("SIB 1A");
        mhs1.updateIpk (3.89);
        mhs1.tampilkanInformasi();

        Mahasiswa13 mhs2 = new Mahasiswa13("Byan", "2446070909", 3.79, "SIB 1B");
        mhs2.updateIpk(3.89);
        mhs2.tampilkanInformasi();
    }
}