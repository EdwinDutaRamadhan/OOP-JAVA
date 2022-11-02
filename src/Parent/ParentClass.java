/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parent;

/**
 *
 * @author HP
 */
public class ParentClass {
    protected String university = "UKSW";
    public void cetak(){
        System.out.println("UNIVIRSITAS : " + this.university);
    }

    public void angkatan(){
        System.out.println("2020");
    }
    
    public String hobi(String hobi1, String hobi2){
        return "Hobi 1 : "+hobi1+" Hobi 2 : "+hobi2;
    }
    public String hobi(String hobi1, String hobi2, String hobi3){
        return "Hobi 1 : "+hobi1+" Hobi 2 : "+hobi2+" Hobi 3 : "+hobi2;
    }
}
