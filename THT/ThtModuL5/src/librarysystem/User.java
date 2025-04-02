package librarysystem;

public class User {
    private String nama;
    private String idUser;

    public User(String nama, String idUser) {
        this.nama = nama;
        this.idUser = idUser;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public void pinjamBuku(Buku buku) {
        if (!buku.isStatusDipinjam()) {
            buku.pinjamBuku();
        } else {
            System.out.println("Buku '" + buku.getJudul() + "' tidak tersedia.");
        }
    }


    public void kembalikanBuku(Buku buku) {
        buku.kembalikanBuku();
    }
}
