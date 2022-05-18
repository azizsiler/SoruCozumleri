package ElifHocaSorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("olusturmk istediginiz list uzunlugu giriniz");
        int listLength= scan.nextInt();

        List<Integer> liste=new ArrayList<>();
        System.out.println("girdiginiz list uzunlugu kardar eleman ekleyiniz");

        for (int i = 0; i <listLength; i++) {
            liste.add(scan.nextInt());
            
        }
        tekrarliEleman(liste);
    }

    private static void tekrarliEleman(List<Integer> liste) {
        List<Integer>tekrarliList=new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {
            for (int j= 0; j+1 < liste.size(); j++) {
                if (liste.get(i)==liste.get(j)&&tekrarliList.contains(liste.get(i)));
                tekrarliList.add(liste.get(i));

            }
            
        }
        System.out.println(tekrarliList);
    }
}
