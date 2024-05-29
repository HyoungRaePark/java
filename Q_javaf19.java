import java.util.Scanner;

public class Q_javaf19
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int check = 0;

         while (check == 0) 
         {

            System.out.println("정수를 더합니다");
            System.out.println("0을 입력하면 종료합니다");
            System.out.print("몇개를 더할까요?=>");
    
            a = x.nextInt();

            if(a==0)
            {
                check = 1;
            }
            else
            {
                System.out.println("입력한 정수의 갯수는"+a+"입니다. "+a+"개만큼의 숫자를 입력해주세요");
        
                for(int i = 0; i < a ; i++)
                {
                    System.out.printf("%d번째의 숫자를 입력해주세요=>",i+1);
                    b = x.nextInt();
                    c += b;
                }
                System.out.println("합계는"+c);
                d = c/a; 
                System.out.println("평균은"+d);
                System.out.println("결과값이 다 출력되었습니다. 시스템을 종료합니다");
                check = 1;

            }
            
         }
         x.close();
    }  
}
