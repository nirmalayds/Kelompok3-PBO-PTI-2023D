/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek1;

/**
 *
 * @author Nirmala Alayda
 */
public class Durasi {
    String durasi = "Durasi";
     String cbDurasi = "cbDurasi.getSelectedItem()";
        switch(cbDurasi){
            case "1 Jam":
                txtBiaya.setText("90000");
                break;
            case "2 Jam":
                txtBiaya.setText("180000");
                break;
            case "3 Jam":
                txtBiaya.setText("270000");
                break;
            case "4 Jam":
                txtBiaya.setText("360000");
                break;
            case "5 Jam":
                txtBiaya.setText("450000");
                break;
         
        }
        txtBiaya.setText(""+Integer.toString(durasi));
}
