import java.util.Scanner;

public class Q_javaf1
{

    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int check = 0;

        while(check==0)
        {
            System.out.println("세자리의 정수를 입력하시오");
            a =x.nextInt();

            if(a>99)
            {
                if(a<999)
                {
                    System.out.println("세자리의 정수는"+a+"입니다");
                    break;
                }
                else
                {
                    System.out.println("다시 입력하세요");
                }
            }
            else
            {
                System.out.println("다시 입력하세요");
            }
            
        }x.close();
    }
}