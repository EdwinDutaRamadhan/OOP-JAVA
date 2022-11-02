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
public class Lingkaran extends BangunDatar{
    int rusuk;

    public Lingkaran(int rusuk) {
        this.rusuk = rusuk;
    }
    public float luas(){
        //return (float) (Math.PI * rusuk * rusuk);
        return (float) ((22 * rusuk * rusuk)/7);
    }
    public float keliling(){
        //return (float) (2 * Math.PI * rusuk);
        return (float) (2 * 22 * rusuk)/7;
    }
}
