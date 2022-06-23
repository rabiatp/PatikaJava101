import java.util.Scanner;

public class groceryStore {
    static double akg;
    static double ekg;
    static double dkg;
    static double mkg;
    static double pkg;

  static void Pay(double akg,double ekg,double dkg, double mkg, double pkg)
    {
      double pay = akg * 2.14 + ekg * 3.67 + dkg *1.11 + mkg * 0.95 + pkg * 5.00;
      System.out.println(pay);
    }    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Armut kaç kilo ? :");
        akg = input.nextDouble();
        
        System.out.println(" Elma kaç kilo ? :");
        ekg = input.nextDouble();

        System.out.println(" domates kaç kilo ? :");
        dkg = input.nextDouble();

        System.out.println(" muz kaç kilo ? :");
        mkg = input.nextDouble();

        System.out.println("patlıcan kaç kilo ? :");
        pkg = input.nextDouble();

        System.out.println("Toplam tutar:");
        Pay(akg, ekg, dkg, mkg, pkg);  
    }
}
