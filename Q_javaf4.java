import java.util.Scanner;

public class Q_javaf4
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int i = 0;
        int check = 0;
        System.out.println("카운트 다운합니다");

        while (check==0)
        {
            a = x.nextInt();
            if(a>0)
            {
                check = 1;
            }
            else
            {
                System.out.println("양의 정수값을 입력해주세요");
            }
        }

        for(i=1;i<=a;i++)
        {
            if(a>0)
            {
                System.out.println(a-i);
            }
        }
        System.out.printf("입력한 값이 %d이 되었습니다\n",(a-i));
        x.close();
    }
}
