package ElifHocaSorular;

import java.util.Scanner;

public class S04 {
    public static void main(String[] args) {
        // Kullanicidan iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz
        // yukarida verilen ilk ve ikinci degiskenlerin ilk harflerini atarak birlestiriniz


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen String1 giriniz giriniz");
        String str1= scan.nextLine();
        System.out.println("lutfen String1 giriniz giriniz");
        String str2= scan.nextLine();

        System.out.println("stringlerin birlesimi"+ str1+" "+ str2);
        System.out.println("stringlerin birlesimi"+ str1.concat(str2));

        String ilkSiz=str1.substring(1);
        String ilkSiz2 =str2.substring(1);

        System.out.println("ilk harfi sililen stringler"+ilkSiz+ilkSiz2);

    }
}
