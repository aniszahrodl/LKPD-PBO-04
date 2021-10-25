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
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersegiPanjang pp=new PersegiPanjang();
        pp.luas(10, 5);
        pp.keliling(10, 5);
        pp.luas(3.6, 8);
        pp.keliling(3.6, 8);
        pp.luas(6, 8.3);
        pp.keliling(6, 8.3);
        pp.luas(5.6, 8.8);
        pp.keliling(5.6, 8.8);
        
        Persegi p=new Persegi();
        p.luas(4.5);
        p.keliling(4.5);
        p.luas(7);
        p.keliling(7);
        
        Lingkaran L=new Lingkaran();
        L.luas(5);
        L.keliling(5);
        L.luas(7.4);
        L.keliling(7.4);
        
        Segitiga s=new Segitiga();
        s.luas(8, 10);
        s.keliling(8, 8, 8);
        s.luas(8, 11.5);
        s.keliling(8, 8, 8);
        s.luas(12.2, 9);
        s.keliling(12.2, 12.2, 12.2);
        s.luas(13.9, 20.7);
        s.keliling(13.9, 13.9, 13.9);
    }
    
}
