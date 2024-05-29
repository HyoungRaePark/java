import java.util.Scanner;

public class Q_javaf20 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        System.out.println("정수를 더합니다");
        System.out.print("몇개를 더할까요?=>");

        a = x.nextInt();

        System.out.println("입력한 값은"+a+"입니다 "+a+"개 만큼의 숫자를 입력하세요");

        for(int i = 0; i<a; i++)
        {
            System.out.printf("%d 번째 정수=>",i+1);
            b = x.nextInt();
            c += b;
        }
        d = c/a;

        if(c>999)
        {
            System.out.println("합계가 1000을 넘었습니다");
            System.out.println("마지막 값은 무시합니다");

            for(int j = 1; j<a; j++)
            {
                e += b;
            }
            d = e/(a-1);

            System.out.println("합계는"+e+"입니다");
            System.out.println("평균은"+d+"입니다");
            System.out.println("시스템을 종료합니다");
        }
        else
        {
            System.out.println("합계는"+c+"입니다");
            System.out.println("평균은"+d+"입니다");
            System.out.println("시스템을 종료합니다");
        }
        x.close();
        
    }
    
}
