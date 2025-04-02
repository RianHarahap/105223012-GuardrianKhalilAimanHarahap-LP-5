import librarysystem.Buku;
import librarysystem.Perpustakaan;
import librarysystem.User;

public class Main {
    public static void main(String[] args) {

        Perpustakaan perpustakaan = new Perpustakaan(5);

        Buku buku1 = new Buku("cba", "Harahap", 2024);
        Buku buku2 = new Buku("zxy", "Rian", 2024);
        Buku buku3 = new Buku("abc", "Cinta", 2025);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        perpustakaan.tampilkanBuku();

        User user = new User("Rian", "U001");

    
        user.pinjamBuku(buku1);
        user.pinjamBuku(buku2);

        perpustakaan.tampilkanBuku();

        user.kembalikanBuku(buku1);

        perpustakaan.tampilkanBuku();
    }
}
