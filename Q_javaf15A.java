import java.util.Scanner;

public class Q_javaf15A
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;


        System.out.println("왼쪽 위에가 직각인 이등변 삼각형 표시하세요");
        System.out.print("생성할 삼각형의 단수를 입력하세요 =>");
        a = x.nextInt();



        for(int j = 0; j<=a ; a--)
        {
            for(int i = 1; i <= a ; i++)
            {
                System.out.print("*");
            }
            System.out.print("\n");

        }
        x.close();

    }
    
}
