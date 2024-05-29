import java.util.Scanner;

public class Q_javaf5A 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int i = 0;
        int check = 0;


        while (check ==0 ) 
        {
            System.out.print("입력한 숫자만큼 * 가 입력됩니다");
            a = x.nextInt();

            if(a>0)
            {
                check = 1;
            }else
            {
                System.out.println("다시입력하세요");
            }
            
        }



        for(i=0;i<=a;i++)
        {
            if(i<a)
            {
                System.out.print("*");
            }
            else
            {
                break;
            }

        }
        x.close();
    }
}
