/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek1;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nirmala Alayda
 */
public final class ModelBooking {
    
    private DefaultTableModel tabel = new DefaultTableModel();
    public ModelBooking(){
        
        getTabel().addColumn("Admin");
        getTabel().addColumn("Lapangan");
        getTabel().addColumn("Tanggal");
        getTabel().addColumn("Waktu");
        getTabel().addColumn("Durasi");
        getTabel().addColumn("Biaya");
        getTabel().addColumn("Nama");
        getTabel().addColumn("No HP");
        
    }
    
    
    /*
    * @return the tabel
    */
    public DefaultTableModel getTabel(){
        return tabel;
    }
    
    /**
     * @param tabel the tabel to set
     */
    public void setTabel(DefaultTableModel tabel){
        this.tabel = tabel;
    }
    
    
}
