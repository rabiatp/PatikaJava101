import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

/*
 * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. 
 * Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
 * Kilo (kg) / Boy(m) * Boy(m)
 */
import java.util.Scanner;;

public class IndexCalculator {
    static double size;
    static double kg;
    static double index;

    static void Index(double size, double kg)
    {
        index = kg / (size * size);
        System.out.println(index);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütefn boyunuzu(metre cinsinden) giriniz:");
        IndexCalculator.size = input.nextDouble();

        System.out.println("lütfen kilonuzu giirn:");
        IndexCalculator.kg = input.nextDouble();

        System.out.println("Vücut kitle indeksiniz:");
        Index(size, kg);

    }
}
