package ElifHocaSorular;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        /*
         /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */
         Scanner scan= new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas>=18){
            if (yas>=70){
                System.out.println("yasi oy kullanmaya uygundur");
                System.out.println("uc kez oy kullanabilir");
            }

        }
    }

}
