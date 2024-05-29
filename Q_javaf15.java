import java.util.Scanner;

public class Q_javaf15 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형 표시하세요");
        System.out.print("생성할 삼각형의 단수를 입력하세요 =>");
        a = x.nextInt();
        
        for(int i = 0; i < a ; i++)
        {
            for(int j = 0; j <= i ; j++)
            {
                System.out.print("^");   
            }
            System.out.println();
        }
        x.close();
    }
    
}
