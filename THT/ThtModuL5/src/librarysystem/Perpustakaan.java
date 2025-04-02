package librarysystem;

public class Perpustakaan {
    private Buku[] koleksiBuku;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        koleksiBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < koleksiBuku.length) {
            koleksiBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku '" + buku.getJudul() + "' telah ditambahkan.");
        } else {
            System.out.println("Perpustakaan penuh");
        }
    }

    public void tampilkanBuku() {
        if (jumlahBuku == 0) {
            System.out.println("kosong.");
        } else {
            System.out.println("///Daftar Buku di Perpustakaan:///");
            for (int i = 0; i < jumlahBuku; i++) {
                System.out.println("Judul: " + koleksiBuku[i].getJudul() + " | Penulis: " + koleksiBuku[i].getPenulis() + " | Tahun: " + koleksiBuku[i].getTahunTerbit());
            }
        }
    }
}

