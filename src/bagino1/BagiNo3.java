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
public class BagiNo3 {
    public static void main(String[] args){
     System.out.println("Sebelum Pembagian");
     try{
         System.out.println(5/0);
     }
     catch(Throwable t){
         System.err.print("Pesan Kesalahan");
         System.err.println(t.getMessage());
     }
     System.err.println("Sesudah Pembagian");
 }   
}
