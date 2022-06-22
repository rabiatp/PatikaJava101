/*
 * Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı
 * Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , 
 * tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 * */
import java.util.Scanner;

public class KDVAmount {
    static double KDV;
    static double Price;
    static double kdvPrice;

    static double KdvHesaplama(double price)
    {
        Price = price;
        System.out.print("KDV'siz fiyat: ");
        System.out.println(price);

        if(price > 0 && price < 1000)
        {
            KDV = 0.18;
            double kdvtutar = price * KDV;
            double kdvPrice = price + kdvtutar;
       
            System.out.print("KDV tutarı: ");
            System.out.println(kdvtutar);
            
            
            System.out.print("KDV'li fiyat: ");
            System.out.print(kdvPrice);
            return kdvPrice;
        }
        else 
        {
            KDV = 0.08;
              Double kdvtutar = price * KDV;
            double kdvPrice = price + kdvtutar;
            
            System.out.print("KDV tutarı: ");
            System.out.println(kdvtutar);
            
          
            System.out.print("KDV'li fiyat: ");
            System.out.print(kdvPrice);
            return kdvPrice;
        }

    }
    public static void main(String[] args) 
    {
        KDVAmount kdv = new KDVAmount();
        Scanner input = new Scanner(System.in);
        System.out.println("Para girin: ");
       
        kdv.Price = input.nextDouble();

        KdvHesaplama(kdv.Price);
    }
   
}
