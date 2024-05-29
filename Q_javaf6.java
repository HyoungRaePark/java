import java.util.Scanner;

public class Q_javaf6 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int check =0;

        System.out.println("숫자를 입력하여 *와+를 번갈아가며 표시하는 프로그램을 작성하세요");

        while (check == 0) 
        {
            System.out.println("몇개를 표시할 까요?");
            a = x.nextInt();

            if(a>0)
            {
                check =1;
            }
            else
            {
                System.out.println("양의 정수값을 입력해주세요");
            }
            
        }

        for(b=0;b<a;b++)
        {
            if(b%2==1)
            {
                System.out.print("+");
            }
            else
            {
                System.out.print("*");
            }
  
        }
        x.close();


    }
    
}
