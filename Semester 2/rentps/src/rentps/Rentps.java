/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentps;

/**
 *
 * @author Asus
 */
public class Rentps {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Menjalankan form GUI di thread Event Dispatch Thread
        javax.swing.SwingUtilities.invokeLater(() -> {
            new RentalForm().setVisible(true);
        });
    }
    
}
