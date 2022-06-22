/*
 * Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin 
 * sınav puanlarını kullanıcıdan alan 
 * ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 * kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , 
 * küçük ise "Sınıfta Kaldı" yazsın.
 *  If ve Else kullanılmayacak...
 */
import java.util.Scanner;

class Dersler{
    static int Math;
    static int Chemical;
    static int Turkish;
    static int History;
    static int Music;
    static int Average;

    static  double Ortalama(int math, int chemical, int turkish, int history, int music)
    {

             Math = math;
             Chemical = chemical;
             Turkish = turkish;
             History = history;
             Music = music;
             int average =(math + chemical + turkish + history + music)/5;
             
              Average = average;
             System.out.println("grade average");
             System.out.println(Integer.parseInt(String.valueOf(average)));
             return average;
             
    }
    static void condition()
    {
       
        System.out.print(Average > 60 ? "geçtiniz" : "kaldınız");
    }
    public static void main(String[] args) 
{
     Dersler lesson = new Dersler();
     Scanner input = new Scanner(System.in);
     System.out.print("Enter math grade ");
     lesson.Math = input.nextInt();
    
     System.out.print("Enter chemical grade ");
     lesson.Chemical = input.nextInt();

     System.out.print("Enter Turkish grade ");
     lesson.Turkish = input.nextInt();

     System.out.print("Enter history grade ");
     lesson.History = input.nextInt();

     System.out.print("Enter music grade ");
     lesson.Music = input.nextInt();

     Ortalama(lesson.Math, lesson.Chemical, lesson.Turkish, lesson.History, lesson.Music);
     condition();
 }  

}

    