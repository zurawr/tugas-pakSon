/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inharitancebangunruang_pakson;

/**
 *
 * @author SMK TELKOM 001
 */
public class InharitanceBangunRuang_PakSon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();
        
        Balok balok = new Balok();
        balok.p = 20;
        balok.l = 10;
        balok.t = 12;        
        
        Bola bola = new Bola();
        bola.r = 14;
        
        LimasSegitiga limasSegitiga = new LimasSegitiga();
        limasSegitiga.t = 20;
        limasSegitiga.La = 15;
        limasSegitiga.L1 = 10;
        limasSegitiga.L2 = 12;
        limasSegitiga.L3 = 14;
        
        Tabung tabung = new Tabung();
        tabung.t = 18;
        tabung.r = 6;
        
        bangunRuang.luas();
        bangunRuang.volume();
        
        balok.luas();
        balok.volume();
        
        bola.luas();
        bola.volume();
        
        limasSegitiga.luas();
        limasSegitiga.volume();
        
        tabung.luas();
        tabung.volume();
    }    
}
