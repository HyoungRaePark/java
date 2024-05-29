import java.util.Random;
import java.util.Scanner;


public class Q_javaf2
{
 
    public static void main(String[] args)
     {
        Scanner x = new Scanner(System.in);
        Random y = new Random();

        int a = 0;
        int b = 10 ;
        b = y.nextInt(99);
        int check = 0;

        System.out.println("숫자맞추기 게임시작");
        System.out.println("10부터 99사이의 숫자를맞추세요");

        while (check==0) 
        {
            System.out.println("어떤숫자일까?");
            a = x.nextInt();


            if(a>b)
            {
                System.out.println("더 작은 숫자입니다");
            }
            else
            {
                System.out.println("더 큰 숫자입니다");
            }
            if(a==b)
            {
                System.out.println("정답 입니다");
                break;  
            } 
            
        }x.close();

    }
}