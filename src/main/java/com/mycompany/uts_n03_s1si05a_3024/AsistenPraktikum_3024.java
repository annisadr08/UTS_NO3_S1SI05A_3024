/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_n03_s1si05a_3024;

/**
 *
 * @author ASUS
 * ANNISA DWI RAHMAWATI / 21103024 / S1SI05A
 */
public abstract class AsistenPraktikum_3024 extends Mahasiswa_3024 {
    String mkAsisten;
    int jmlPertemuan;
    
    public double totalPendapatan(){
        return(jmlPertemuan * 50000);
    }
    public void tampilDataAsistenPraktikum() {
        super.tampilDataMhs();
        System.out.println(" Mata Kuliah      : " + mkAsisten);
        System.out.println(" Jumlah Pertemuan : " + jmlPertemuan);
        System.out.println(" Total Pendapatan : " + totalPendapatan());
        
        
    }
    
}
    
