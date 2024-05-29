import java.util.Scanner;

public class Q_javaf9
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int check = 0;
        int a = 0;

        System.out.println("0부터 입력한 값까지 카운트 업 하는 프로그램을 작성하세요");

        while (check == 0) 
        {
            System.out.println("무엇을 입력하시겠습니까?");
            a = x.nextInt();
            
            if(a>0)
            {
                for(int i = 0; i<=a;i++)
                {
                    System.out.print(i);
                    check = 1;
                }

            }
            else
            {
                System.out.println("양의 정수값이 아닙니다. 다시 입력하세요");

            }

        }
        System.out.println("\n끝났습니다.");
        x.close();

        
    }
    
}
