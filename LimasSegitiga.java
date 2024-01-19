/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inharitancebangunruang_pakson;

/**
 *
 * @author SMK TELKOM 001
 */
public class LimasSegitiga extends BangunRuang{
    double t;
    double La;
    double L1;
    double L2;
    double L3;
    
    @Override
    double luas(){
        double luas = (double)(La+L1+L2+L3);
        System.out.println("Luas limas segitiga : "+ luas);
            return luas;
    }
    
    @Override
    double volume(){
        double volume = (double)(1/3*La*t);
            System.out.println("Volume limas segitiga : "+ volume);
            return volume;
    }
    
}
