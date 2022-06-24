//switch case ile hesap makinesi
import java.util.Scanner;
public class Calculator {
    static int x1;
    static int x2;
    static int value;
    static int choose;
    static void calculator(int x, int y,int choose)
    {
        switch(choose)
        {
            case 1: 
                value =x + y;
                System.out.println(value);
                break;
            case 2:
                value = x-y;
                System.out.println(value);
                break;
            case 3:
                value = x*y;
                System.out.println(value);
                break;
            case 4:
                value = x/y;
                System.out.println(value);
                break;
            default:
                    System.out.println("seçim yapmadınız");
                    break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the first value: ");
        x1 = sc.nextInt();

        
        System.out.println("enter the second value: ");
        x2 = sc.nextInt();

        System.out.println("select the action you want to do: \n  Addition --> 1 \n Subtraction --> 2 \n Multiplication  -->3 \n Divsion  -->4\n");
        choose = sc.nextInt();

        calculator(x1, x2, choose);
    }
}
