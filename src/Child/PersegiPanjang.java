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
public class PersegiPanjang extends BangunDatar{
    private int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public float luas(){
        return this.panjang * this.lebar;
    }
    public float keliling(){
        return (this.panjang * 2) + (this.lebar * 2);
    }
}
