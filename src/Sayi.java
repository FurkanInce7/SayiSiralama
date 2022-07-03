import java.util.Scanner;
public class Sayi {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input =  new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz: ");
        a= input.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz: ");
        b= input.nextInt();

        System.out.println("Lutfen ücüncü sayiyi giriniz: ");
        c= input.nextInt();

        if ((a >b) && (a > c )) {
            if (b > c)
            {
                System.out.println(" Islem Sonucunuz: ");
                System.out.println(" a > b > c");
            }else {
                System.out.println(" Islem Sonucunuz: ");
                System.out.println("a > c > b");
            }
        } if ((b > a) && (b > c)) {
            if (a > c ) {
                System.out.println(" Islem Sonucunuz: ");
                System.out.println("b > a > c");
            }else {
                System.out.println(" Islem Sonucunuz: ");
                System.out.println("b > c > a");
            }
        }if ((c > a) && (c > b)){
            if (a > b) {
                System.out.println(" Islem Sonucunuz: ");
                System.out.println("c > a > b");
            }else {
                System.out.println(" Islem Sonucunuz: ");
                System.out.println("c > b > a");
            }
        } else {
            System.out.println(" Hatali bir islem yaptiniz.");
        }
    }
}
