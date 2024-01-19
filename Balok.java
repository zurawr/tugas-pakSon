/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inharitancebangunruang_pakson;

/**
 *
 * @author SMK TELKOM 001
 */
public class Balok extends BangunRuang{
    double p;
    double l;
    double t;
    
    @Override
    double luas (){
        double luas = 2*p*l*t;
        System.out.println("Luas balok : "+luas);
        return luas;
    }
    
    @Override
    double volume(){
        double volume = p*l*t;
        System.out.println("Volume balok : "+volume);
        return volume;
    }
    
}
