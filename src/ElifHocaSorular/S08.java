package ElifHocaSorular;

public class S08 {
    public static void main(String[] args) {
        /*
        String 2D Array olustur
        String $ isareti varsa 3.2 ile carp
        String Euro isareti varsa 4.2 ile carp
        daha sonra elemanlarin toplanini double olarak yazdir
         */

        String arr[][] = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        double toplam=0;

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3; j++) {
                if (arr[i][j].contains("$")){
                    toplam+=Double.parseDouble((arr[i][j].replace("$","")))*3.2;


                }else if (arr[i][j].contains("€")){
                    toplam+=Double.parseDouble((arr[i][j].replace("€","")))*4.2;

                }

            }

        }
        System.out.println(" toplam;"+toplam);
    }
}
