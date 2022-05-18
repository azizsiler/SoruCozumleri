package ElifHocaSorular;

public class S02 {
    public static void main(String[] args) {
        /*
        final notu tanimlayin ve Nested Ternary ile cozunuiz
        'A' == gayet basarili
        'B' == basarili
        'C'== No gayret
        bunlarin disinda ise === digerleri yazdiriniz.

         */

        char finalNotu='p';
        String sonuc="";

        sonuc=(finalNotu=='A')? "gayet basarili":
                (finalNotu=='B')? "basarili":
                        (finalNotu=='C')? "Ha gayet": "digerleri";

        System.out.println("sonuc = " + sonuc);
    }
}
