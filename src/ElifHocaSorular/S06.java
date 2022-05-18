package ElifHocaSorular;

public class S06 {
    public static void main(String[] args) {
        /*
        dizi elemanlarinin ortalama degerini toplayan
        ve ortalamadan buyuk olan elemanlari yazdiran bir prograrm yaziniz
         */

        int arr[]={1,2,3,4,5,6,7};
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];

        }
        double ortalama= toplam/arr.length;
        System.out.println(ortalama);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalama){
                System.out.println("ortalamadan buyuk olanlar"+arr[i]);
            }

        }

    }
}
