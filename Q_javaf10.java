import java.util.Scanner;

public class Q_javaf10 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        int check =0;

        System.out.println("1부터 n까지의 합을 구하는 프로그램을 작성하세요");
        while (check ==0) 
        {
            System.out.println("몇을 입력하시겠습니까?");
            a = x.nextInt();
            if(a>=0)
            {
                for(int i = 1; i<=a; i++)
                {
                    sum = sum+i;
                    check =1;
                    if(i==1)
                    {
                        System.out.printf("%d",i);

                    }
                    else
                    {
                        System.out.printf("+%d",i);
                    }

                }
                System.out.println("\n총 합계는"+sum+"입니다");

            }
            else
            {
                System.out.println("양의 정수값이 아닙니다 다시 입력하세요");

            }
        }
        x.close();
        
    }
}
