/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagino1;

/**
 *
 * @author Saddam
 */
public class BagiNo4 {
    public static void main(String[] args){
        double BILANGAN = 100.0;
        
        System.out.println("Sebelum Pembagian");
        for (int i=5; i>=0; i--){
        try {
            System.out.print(BILANGAN+"/"+i+"=");
            System.out.println((BILANGAN/i));
        }
        finally{
            System.out.print("Bagian Finally di Jalankan");
        }
    }
        System.out.println("Selesai");
    }
}
