import java.util.Scanner;

public class Q_javaf21 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        System.out.println("정수를 더합니다");
        System.out.print("몇개를 더할까요?=>");
        a = x.nextInt();

        for(int i = 0; i < a; i++)
        {
            System.out.print("정수를 입력하세요 =>");
            b = x.nextInt();
            if(b<0)
            {
                System.out.printf("정수:%d \n",b);
                System.out.println("음수는 더하지 않습니다");
                i--;
            }
            else
            {
                System.out.printf("정수:%d \n",b);
                c += b;
            }
            d = c/a;
        }
        System.out.println("합계는"+c+"입니다");
        System.out.println("평균은"+d+"입니다");
        x.close();
        
    }
    
}
