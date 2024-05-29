import java.util.Scanner;

public class Q_javaf14 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int check = 0;

        System.out.println("정방향을 표시합니다");
        while (check==0) 
        {
            System.out.print("입력=>");
            a = x.nextInt();
            if(a>0) 
            {
                System.out.println("단수는"+a);

                for(int i = 1; i<=a; i++)
                {
                    for(int j = 0; j<a; j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                check = 1;
            }
            else
            {
                System.out.println("양수값으로 입력해주세요");
                check = 0;
            }
            
            
        }
        x.close();
    }
}
