import java.util.Scanner;

/*
 *Java ile yarı çapını kullanıcıdan aldığınız 
 * yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
 * 𝜋 sayısını = 3.14 alınız.
 * Formül : (𝜋 * (r*r) * 𝛼) / 360
 */

public class AreaCalculation {
    static double r;
    static double a;
    static double pi = 3.14;
   
    public static void  AreaCal(double r, double a)
    {
        double area=(((pi) * (r*r) * a) / 360);
        System.out.print(area);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("r yarıçap girin");
        AreaCalculation.r = input.nextDouble();

        System.out.println("alfa yarıçap girin");
        AreaCalculation.a = input.nextDouble();

        System.out.println("Daire alanı:");
        AreaCal(r, a);
        
    }
    
}
