/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inharitancebangunruang_pakson;

/**
 *
 * @author SMK TELKOM 001
 */
public class Tabung extends BangunRuang{
    double t;
    double r;
    
    @Override
    double luas(){
        double luas = (double)(2*Math.PI*r*r+t);
        System.out.println("Luas tabung : "+ luas);
            return luas;
    }
    
    @Override
    double volume(){
        double volume = (double)(Math.PI*r*r*t);
            System.out.println("Volume tabung : "+ volume);
            return volume;
    }
}
