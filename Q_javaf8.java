import java.util.Scanner;

public class Q_javaf8 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int check = 0;
        int  sum = 0;
        int z = 1;
        int total = 0;


        while (check==0)
        {
            System.out.println("양의 정수값을 넣어서 1부터 n까지의 곱을 구하는 프로그램을 작성하자");
            System.out.println("값을 입력하세요");
            
            int a = x.nextInt();

            

            if(a>0)
            {

                System.out.println("입력한 값은"+a+"입니다");
                
                for(int i = 1 ; i <= a ; i++)
                {
                    sum = sum + i;
                    z = z*i;
                    total = sum+z;
                    check = 1;

                }
                System.out.println(total);
            
            }
            else
            {
                System.out.println("양의 정수값이 아닙니다 다시 입력하세요");

            }

            
        }
        x.close();

    }
    
}
