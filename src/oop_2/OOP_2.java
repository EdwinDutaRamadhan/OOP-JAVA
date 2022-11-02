/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_2;

import Child.ChildClass;
import Child.Lingkaran;
import Child.Persegi;
import Child.PersegiPanjang;
import Child.Segitiga;
import Model.UserModel;

/**
 *
 * @author HP
 */
public class OOP_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        UserModel model = new UserModel();
//        model.setNama("Edwin");
//        System.out.println(model.getNama());
//        model.setNim("672020272");
//        System.out.println(model.getNim());
//        ChildClass child = new ChildClass();
//        child.cetak();
//        
//        
//        child.angkatan();
//        System.out.println(child.hobi("Olahraga", "Tidur"));
//        System.out.println(child.hobi("Olahraga","Tidur","Game"));
    Persegi persegi = new Persegi(6);
        System.out.println("Keliling Persegi : " + persegi.keliling());
        System.out.println("Luas Persegi : " + persegi.luas());
    PersegiPanjang persegiPanjang = new PersegiPanjang(10,6);
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang : " + persegiPanjang.keliling());
    Segitiga segitiga = new Segitiga(4,5);
        System.out.println("Luas Segitiga : " + segitiga.luas());
        System.out.println("Keliling Segitiga : " + segitiga.keliling());
    Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
    }
    
}
