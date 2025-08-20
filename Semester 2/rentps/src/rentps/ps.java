/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentps;

/**
 *
 * @author Asus
 */
public abstract class ps {
    protected String id;
    protected String tipe;
    protected String kelas;
    protected boolean tersedia;

    public ps(String id, String tipe, String kelas) {
        this.id = id;
        this.tipe = tipe;
        this.kelas = kelas;
        this.tersedia = true;
    }

    public String getId() { return id; }
    public String getTipe() { return tipe; }
    public String getKelas() { return kelas; }
    public boolean isTersedia() { return tersedia; }
    public void setTersedia(boolean tersedia) { this.tersedia = tersedia; }

    public abstract int getHargaPerJam();
}
