import java.util.Arrays;

public class S07 {
    public static void main(String[] args) {

        /*
        bulunan bir string ifadeyi "HeySiri"
        bir array'a cevirin ve BysSiri yazdirin
         */

        String str="HaySiri";
        str=str.replace("Hay","Bye");

        String arr[]=new String[1];
        arr[0]=str;

        System.out.println(Arrays.toString(arr));


        String str1="HaySiri";
        String yeniStr[]=str1.split("y");
        yeniStr[0]="Bye";
        str1=yeniStr[0]+yeniStr[1];

        System.out.println(str1);

        String str1Arr [] =new String[1];
        str1Arr[0]=str1;
        System.out.println(Arrays.toString(str1Arr));{

        }

    }
}
