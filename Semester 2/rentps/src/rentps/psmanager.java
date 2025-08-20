/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentps;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
public class psmanager {
    private ArrayList<ps> daftarPS;

    public psmanager() {
        daftarPS = new ArrayList<>();

        // Menambahkan 4 unit PS4 Normal
        for (int i = 1; i <= 4; i++) {
            daftarPS.add(new psunit("PS4 meja ke-" + i, "PS4", "Normal"));
        }
        daftarPS.add(new psunit("PS4 VIP meja-1", "PS4", "VIP"));

        // Menambahkan 2 unit PS5 VIP
        for (int i = 1; i <= 2; i++) {
            daftarPS.add(new psunit("PS5 meja ke-" + i, "PS5", "VIP"));
        }
        
    }

    public ArrayList<ps> getDaftarPS() {
        return daftarPS;
    }

    public ps getPSUnitById(String id) {
        for (ps ps : daftarPS) {
            if (ps.getId().equals(id)) {
                return ps;
            }
        }
        return null;
    }

    public ArrayList<ps> getAvailablePS(String tipe, String kelas) {
        ArrayList<ps> result = new ArrayList<>();
    for (ps ps : daftarPS) {
        if (ps.getTipe().equalsIgnoreCase(tipe) &&
            ps.getKelas().equalsIgnoreCase(kelas) &&
            ps.isTersedia()) {
            result.add(ps);
        }
    }
    return result;
    }

    public void batalkanSewa(String id) {
        ps ps = getPSUnitById(id);
        if (ps != null) {
            ps.setTersedia(true);
        }
    }
}
