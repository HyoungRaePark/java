import java.util.Scanner;

public class Q_javaf3 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int min = 0;
        int max = 0;

        System.out.println("2개의 숫자를 입력하세요");

        a = x.nextInt();

        System.out.println("정수A는"+a);

        b = x.nextInt();

        System.out.println("정수B는"+b);

        if(a>b)
        {
            min = b;
            max = a;
        }
        else
        {
            min = a;
            max = b;
        }
       
        for(int i = min; i <= max ; i++)
        {
            System.out.print(" "+i);
        }
        x.close();


    }
}
