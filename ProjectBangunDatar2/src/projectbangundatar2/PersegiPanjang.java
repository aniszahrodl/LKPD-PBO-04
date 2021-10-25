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
public class PersegiPanjang {
    
    void luas(int p, int l){
        int hasil=p*l;
        System.out.println("Persegi panjang dengan p="+p+" dan l="+l);
        System.out.println("Luas: "+hasil+" satuan luas");
    }
    
    void luas(double p, double l){
        double hasil=p*l;
        System.out.println("Persegi panjang dengan p="+p+" dan l="+l);
        System.out.println("Luas: "+hasil+" satuan luas");
    }
    
    void keliling(int p, int l){
        int hasil=2*(p+l);
        System.out.println("Keliling: "+hasil+" satuan keliling");
    }
    
    void keliling(double p, double l){
        double hasil=2*(p+l);
        System.out.println("Keliling: "+hasil+" satuan keliling");
    }
}
