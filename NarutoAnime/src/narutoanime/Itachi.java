/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package narutoanime;

/**
 *
 * @author ASUS
 */
public class Itachi extends Rikudo{
    private String KekkeiGenkai = "Susanoo";
    private String Dojutsu = super.Dojutsu;
    
    void printKekkeiGenkai() {
        System.out.println(this.KekkeiGenkai);
    }
    void printDojutsu() {
        System.out.println(this.Dojutsu);
        setDojutsu();
        System.out.println(this.Dojutsu);
    }
    void setDojutsu() {
        this.Dojutsu = "Mangekyou Sharingan";
    }
    
}
