package DaireAlanCevreHesap;

import java.util.Scanner;

public class App {
    final static float pi = 3.14f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dairenin yarıçapını giriniz:");
        float r = sc.nextFloat();
        System.out.println("Alan :" + (2 * pi * r * r));
        System.out.println("Çevre: " + (2 * pi * r));
        sc.close();
    }
}
