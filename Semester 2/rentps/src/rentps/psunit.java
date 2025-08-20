/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentps;

/**
 *
 * @author Asus
 */
public class psunit extends ps {

    public psunit(String id, String tipe, String kelas) {
        super(id, tipe, kelas); // memanggil constructor dari superclass PS
    }

    @Override
    public int getHargaPerJam() {
        if (tipe.equalsIgnoreCase("PS5") && kelas.equalsIgnoreCase("VIP")) {
        return 25000;
    } else if (tipe.equalsIgnoreCase("PS4") && kelas.equalsIgnoreCase("VIP")) {
        return 15000;
    } else {
        return 10000;
    }
    }

    @Override
    public String toString() {
        return id + " (" + tipe + ", " + kelas + ") - " + (tersedia ? "Tersedia" : "Terisi");
    }
}
