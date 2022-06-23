/*
 * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
 * Taksimetre KM başına 2.20 TL tutmaktadır.
 * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
 * Taksimetre açılış ücreti 10 TL'dir.
 */

 import java.util.Scanner;

 public class TaximeterCalculation {

    static int km;
    static int openPay = 10; 
    static double pay;
    public static void KMCalculation(int km)
    {
        pay = (openPay + (km*2.20));

        if( pay < 20)
        {
            System.out.println("taksimetre ücreti: 20");

        }
        else System.out.println(pay);

    }

    public static void main(String[] args) {
        TaximeterCalculation calculation = new TaximeterCalculation();
        Scanner input = new Scanner(System.in);

        System.out.println(" mesafeyi km cinsinden yazın: ");
        calculation.km = input.nextInt();

        System.out.println("Ödenilecek tutar");
        KMCalculation(calculation.km);

        
    }
    
}
