/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author acer
 */
public class Lingkaran {
    
    void luas(int r){
        int hasil=(22/7)*r*r;
        System.out.println("Lingkaran dengan panjang ruas "+r);
        System.out.println("Luas: "+hasil+" satuan luas");
    }
    
    void luas(double r){
        double hasil=(22/7)*r*r;
        System.out.println("Lingkaran dengan panjang ruas "+r);
        System.out.println("Luas: "+hasil+" satuan luas");
    }
    
    void keliling(int r){
        int hasil=(22/7)*r*2;
        System.out.println("Keliling: "+hasil+" satuan keliling");
    }
    
    void keliling(double r){
        double hasil=(22/7)*r*2;
        System.out.println("Keliling: "+hasil+" satuan keliling");
    }
    
}
