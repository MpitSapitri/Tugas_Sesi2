public class Mahasiswa {
    String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
    }

    void perkenalkanDiri() {
        System.out.println("Halo, nama saya " + this.nama);
    }
}