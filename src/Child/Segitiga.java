/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Child;

import Parent.BangunDatar;

/**
 *
 * @author HP
 */
public class Segitiga extends BangunDatar{
    private int alas, tinggi,miring;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public float luas(){
        return (this.alas * this.tinggi)/2;
    }
    public float keliling(){
        miring = (int) Math.sqrt((this.alas * this.alas) + (this.tinggi * this.tinggi));
        return this.alas + 2 * miring;
    }
}
