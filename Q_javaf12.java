import java.util.Scanner;

public class Q_javaf12 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;


        System.out.println("1부터 n까지의 정수값에 각 값을 제곱해서 표시하는 프로그램을 작성하시오");
        System.out.println("n의 제곱값을 입력해주세요");

        a  = x.nextInt();

        System.out.println("입력한 정수값은"+a+"입니다");

        for(int i = 1; i<=a; i++)
        {
            System.out.printf("%d 의 제곱값은",i);
            System.out.println(" "+i*i+"  입니다");
            
        }
        x.close();
    }
    
}
