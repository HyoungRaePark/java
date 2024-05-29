import java.util.Scanner;

public class Q_javaf7 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);

        int check = 0;

        while (check==0) 
        {
            System.out.println("입력한 숫자 값만큼 자릿수를 출력하세요");
            int a = x.nextInt();
            if(a>0)
            {
                String s = ""+a;
                int b = s.length();
                System.out.printf("입력한 숫자의 자릿수는%d입니다",b);
                check = 1;
            }
            else
            {
                System.out.println("다시 입력하세요");
            }
            
        }
        x.close();
        
    }
}
