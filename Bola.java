/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inharitancebangunruang_pakson;

/**
 *
 * @author SMK TELKOM 001
 */
public class Bola extends BangunRuang{
    double r;
    
    @Override
    double luas(){
        double luas = (double)(4*Math.PI*r*r);
            System.out.println("Luas bola : "+ luas);
            return luas;
    }
    
    @Override
    double volume(){
        double volume = (double)(4/3*Math.PI*r*r*r);
            System.out.println("Volume bola : "+ volume);
            return volume;
    }
    
}
