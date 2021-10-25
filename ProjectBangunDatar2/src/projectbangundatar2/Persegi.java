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
public class Persegi {
    void luas(int sisi){
        int hasil=sisi*sisi;
        System.out.println("Persegi dengan panjang sisi "+sisi);
        System.out.println("Luas: "+hasil+" satuan luas");
    }
    
    void luas(double sisi){
        double hasil=sisi*sisi;
        System.out.println("Persegi dengan panjang sisi "+sisi);
        System.out.println("Luas: "+hasil+" satuan luas");
    }
    
    void keliling(int sisi){
        int hasil=4*sisi;
        System.out.println("Keliling: "+hasil+" satuan keliling");
    }
    
    void keliling(double sisi){
        double hasil=4*sisi;
        System.out.println("Keliling: "+hasil+" satuan keliling");
    }
}
