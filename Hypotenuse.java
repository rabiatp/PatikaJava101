import java.util.Scanner;

/*
 * Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
 * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
 * 𝑢 = (a+b+c) / 2
 * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */
public class Hypotenuse {
    static int a;
    static int b;
    static double c;

    public static void Hypoten(int x, int y)
    {
        a = x;
        b = y;
        
        Hypotenuse.c = Math.sqrt((a*a) + (b*b));
        System.out.println(Hypotenuse.c);
    }
    public static void Area()
    {
        double u = (a+b+c)/2;
        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(area);
    }

    public static void main(String[] args) {
        
        Hypotenuse side = new Hypotenuse();
        Scanner input   = new Scanner(System.in);
        
        System.out.println("Enter the first side: ");
        side.a = input.nextInt();
        
        System.out.println("Enter the second side: ");
        side.b = input.nextInt();
        
        System.out.println("notation of the hypotenuse ");
        Hypoten(side.a, side.b);

        System.out.println("Area of the triangle: ");
        Area();
        
        
    }

}
