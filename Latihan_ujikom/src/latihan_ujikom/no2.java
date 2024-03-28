/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_ujikom;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class no2 {
    public static void main(String[] args) {
    int harga;
    double bespot,diskon,bayar;
    Scanner keyboard=new Scanner(System.in);
    System.out.print("Harga Barang : RP.");
    harga=keyboard.nextInt();
    System.out.print("Diskon : RP.");
    diskon=keyboard.nextInt();
    bespot=(diskon/100) * harga;
    bayar=harga-bespot;
    
    
    System.out.println("Harga Barang : RP. "+harga);
    System.out.println("Diskon : RP. "+diskon +" %");
    System.out.println("Diskon (RP.) : "+bespot);
    System.out.println("Total Harga  : "+bayar);
    
}
}
