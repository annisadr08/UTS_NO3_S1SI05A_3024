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
public class StudentStaff_3024 extends Mahasiswa_3024{
    int unitKerja, jamKerja;
    
    public double totalPendapatan(){
        return (jamKerja * 30000);
    }
    public void tampilDataStudentStaff(){
        super.tampilDataMhs();
        System.out.println(" Unit Kerja : " + unitKerja);
        System.out.println(" Jam Kerja : " +jamKerja);
        System.out.println(" Total Pendapatan Student Staff : " +totalPendapatan());
    }
}
