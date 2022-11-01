package Burc;

import java.util.Scanner;

public class burcBulma{

    public static void main(String[] args) {

        Scanner tar=new Scanner(System.in);

        System.out.println("Doğduğunuz Ayı Giriniz\n1-Ocak\n2-Şubat\n3-Mart\n4-Nisan\n5-Mayıs\n6-Haziran\n7-Temmuz\n8-Ağustos\n9-Eylül\n10-Ekim\n11-Kasım\n12-Aralık");
        
        int month=tar.nextInt();

        if(1<=month&&month<=12){

            System.out.println("Doğum Gününüzü Giriniz:");
            
            int gun=tar.nextInt();

            switch(month){

                case 1:

                    if (gun>=1&&21>=gun){

                    System.out.println("Oğlak Burcusunuz");

                    }
                    else if(gun<=31&&gun>21) {

                    System.out.println("Kova Burcusunuz");

                    }
                    else {

                    System.out.println("Hatalı Gün Girdiniz");

                    }
                    break;

                case 2:
                    
                    if (gun>=1&&19>=gun){

                    System.out.println("Kova Burcusunuz");

                    }
                    else if(gun<=28&&gun>19) {

                    System.out.println("Balık Burcusunuz");

                    }
                    else {

                    System.out.println("Hatalı Gün Girdiniz");

                    }
                    break;
                
                case 3:

                    if (gun>=1&&20>=gun){

                    System.out.println("Balık Burcusunuz");

                    }
                    else if(gun<=31&&gun>20) {

                    System.out.println("Koç Burcusunuz");

                    }
                    else {

                    System.out.println("Hatalı Gün Girdiniz");

                    }
                    break;

                case 4:

                    if (gun>=1&&20>=gun){

                    System.out.println("Koç Burcusunuz");

                    }
                    else if(gun<=30&&gun>20) {

                    System.out.println("Boğa Burcusunuz");

                    }
                    else {

                    System.out.println("Hatalı Gün Girdiniz");

                    }
                    break;
                
                case 5:

                    if (gun>=1&&21>=gun){

                    System.out.println("Boğa Burcusunuz");
        
                    }
                    else if(gun<=31&&gun>21) {
        
                    System.out.println("İkizler Burcusunuz");
        
                    }
                    else {
        
                    System.out.println("Hatalı Gün Girdiniz");
        
                    }
                    break;

                case 6:

                    if (gun>=1&&22>=gun){

                    System.out.println("İkizler Burcusunuz");

                    }
                    else if(gun<=30&&gun>22) {

                    System.out.println("Yengeç Burcusunuz");

                    }
                    else {

                    System.out.println("Hatalı Gün Girdiniz");

                    }
                    break;

                case 7:

                    if (gun>=1&&22>=gun){

                    System.out.println("Yengeç Burcusunuz");

                    }
                    else if(gun<=31&&gun>22) {

                    System.out.println("Aslan Burcusunuz");

                    }
                    else {

                    System.out.println("Hatalı Gün Girdiniz");

                    }
                    break;

                case 8:

                    if (gun>=1&&22>=gun){

                    System.out.println("Aslan Burcusunuz");

                    }
                    else if(gun<=31&&gun>22) {

                    System.out.println("Başak Burcusunuz");

                    }
                    else {

                    System.out.println("Hatalı Gün Girdiniz");

                    }
                    break;

                case 9:

                    if (gun>=1&&22>=gun){

                    System.out.println("Başak Burcusunuz");

                    }
                    else if(gun<=30&&gun>22) {

                    System.out.println("Terazi Burcusunuz");

                    }
                    else {

                    System.out.println("Hatalı Gün Girdiniz");

                    }
                    break;

                case 10:

                    if (gun>=1&&22>=gun){

                    System.out.println("Terazi Burcusunuz");

                    }
                    else if(gun<=31&&gun>22) {

                    System.out.println("Akrep Burcusunuz");

                    }
                    else {

                    System.out.println("Hatalı Gün Girdiniz");

                    }
                    break;

                case 11:

                    if (gun>=1&&21>=gun){

                    System.out.println("Akrep Burcusunuz");

                    }
                    else if(gun<=30&&gun>21) {

                    System.out.println("Yay Burcusunuz");

                    }
                    else {

                    System.out.println("Hatalı Gün Girdiniz");

                    }
                    break;
                
                case 12:

                    if (gun>=1&&21>=gun){

                    System.out.println("Yay Burcusunuz");

                    }
                    else if(gun<=31&&gun>21) {

                    System.out.println("Oğlak Burcusunuz");

                    }
                    else {

                    System.out.println("Hatalı Gün Girdiniz");

                    }
                    break;
            
            }

            }

            else {

                System.out.println("Hatalı Ay Girdiniz");

            }

       


        
    }













}
