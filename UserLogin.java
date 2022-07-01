import java.util.Scanner;

/*
 * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
 * eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği 
 * ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , 
 * şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." 
 * sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

public class UserLogin {
    static String userName;
    static String password;

    static void Control(String use, String password)
    {
        Scanner sc = new Scanner(System.in);        
        if(use.equals("Patika" ) && password.equals("Patika123"))
        {
            System.out.println("Şifre doğru");
        }
        else
        {
            System.out.println("şifre sıfırlamak ister misin ? E/H");
            String answer = sc.nextLine(); 
            
            if(answer.equals("E"))
            {       
                System.out.print("yeni şifrenizi yazın");
                String newpass = sc.nextLine();

                    if( newpass != password)
                    {
                        System.out.println("şifreniz oluşturuldu");
                    }
                    else
                    {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    }
            }
            else
            {
                System.out.println("Sistem sonlandırıldı");
                
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        

        System.out.println("kullanıcı adını girin:");
        userName = sc.nextLine();

        System.out.println("kullanıcı şigfresini girin:");
        password = sc.nextLine();
        
        Control(userName, password);

    }
    
}
