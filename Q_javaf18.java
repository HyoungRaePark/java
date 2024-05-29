import java.util.Scanner;

public class Q_javaf18 
{
    public static void main(String[] args) 
    {
        Scanner x =  new Scanner(System.in);
        int a = 0;

        System.out.println("양의 정수값을 읽어서 소수인지를 판정하는 프로그램을 작성하자.");
        System.out.println("소수란 2 이상 n미만인 수중 어떤 수로도 나누어지지 않는 정수값 n이다(즉,자기자신과 1로만 나누어 지는 수) ");

        System.out.print("입력==>");
        a = x.nextInt();

        int b = a%2;
        int c = a%3;

        if(b==0)
        {
            System.out.println("소수가 아닙니다");
        }
        else if(c==0)
        {
            System.out.println("소수가 아닙니다");
        }
        else
        {
            System.out.println("소수입니다");
        }
        x.close();
    }
    
}
