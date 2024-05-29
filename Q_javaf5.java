import java.util.Scanner;

public class Q_javaf5 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int i = 0;
        int check = 0;

        System.out.println("*을 표시하는 프로그램을 만드세요");


        while (check==0) 
        {
            System.out.println("몇개의 *을 찍을까요?");
            a = x.nextInt();
    
            for(b=0;b>a;b++)
            {
                
            }
            if(a>0)
            {
                for(i=0;i<a;i++)
                {
                    System.out.print("*");
                    check = 1;
                }
                
            }
            else
            {
                System.out.println("다시 찍으세요");
            }
            

        }
        x.close();




        
    }
}
