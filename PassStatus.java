import java.util.Scanner;


class  Control 
{
    static int math;
    static int physics;
    static int turkish;
    static int chemical;
    static int music;
   
    public static void LessonControl(int math, int physics,int turkish,int chemical,int music)
    {
        if (math < 0 || math > 100)
        math = 0;
        if (physics < 0 || physics > 100)
        physics = 0;
        if (chemical < 0 || chemical > 100)
        chemical = 0;
        if (turkish < 0 || turkish > 100)
        turkish = 0;
        if (music < 0 || music > 100)
        music = 0;
    double avarage =(math + physics + turkish + chemical + music) /5;    
    if (avarage < 55) {
        System.out.println("Sinifta kaldiniz");
    }
    else {
        System.out.println("Sinifi Gectiniz Tebrikler");
    }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("matematik notunu giriniz");
        math = sc.nextInt();
        
        System.out.print("fizik notunu giriniz");
        physics = sc.nextInt();
        
        System.out.print("turkce notunu giriniz");
        turkish = sc.nextInt();
        
        System.out.print("kimya notunu giriniz");
        chemical = sc.nextInt();
        
        System.out.print("music notunu giriniz");
        music = sc.nextInt();
        
        LessonControl(math, physics, turkish, chemical, music);
    }
   
}

