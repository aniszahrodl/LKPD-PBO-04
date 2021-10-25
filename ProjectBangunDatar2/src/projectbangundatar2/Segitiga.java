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
public class Segitiga {
    
    void luas(int a, int t){
        int hasil=(1/2)*a*t;
        System.out.println("Segitiga dengan panjang sisi "+a+" dan tinggi "+t);
        System.out.println("Luas: "+hasil+" satuan luas");
    }
    
    void luas(double a, double t){
        double hasil=(1.0/2)*a*t;
        System.out.println("Segitiga dengan panjang sisi "+a+" dan tinggi "+t);
        System.out.println("Luas: "+hasil+" satuan luas");
    }
    
    void keliling(int a, int b, int c){
        int hasil=a+b+c;
        System.out.println("Keliling: "+hasil+" satuan keliling");
    }
    
    void keliling(double a, double b, double c){
        double hasil=a+b+c;
        System.out.println("Keliling: "+hasil+" satuan keliling");
    }
}
