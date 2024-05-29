import java.util.Random;
import java.util.Scanner;

public class Q_javaf2A
{

    public static void main(String[] args) 
    {
     Scanner x = new Scanner(System.in);
     Random y = new Random ();   

     int a = 0;
     int i = 1;

     int b ;
     b = y.nextInt(99);
     
     System.out.println("숫자 맞추기 게임 입니다");
     System.out.println(" 기회는 5 번 입니다");

     for(i=0;i<5;i++)
     {
        System.out.println("어떤 숫자 일까요?");
        a = x.nextInt();

        if(a>b)
        {
            System.out.println("더 작은 숫자 입니다");

        }
        else
        {
            System.out.println("더 큰 숫자 입니다");
        }
        if(a==b)
        {
            System.out.println("정답입니다");
        }
     }
     System.out.println("정답은"+b+"입니다");
     x.close();
    }
}