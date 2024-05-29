import java.util.Scanner;

public class Q_javaf11 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int check = 0;


        while (check == 0) 
        {
            System.out.println("신장별 표준 체중 대응표를 표시하는 프로그램입니다");
            System.out.println("신장 시작값을 입력하세요");
            a = x.nextInt();
            System.out.println("신장 최종값을 입력하세요");
            b = x.nextInt();
            System.out.println("신장 증가값을 입력하세요");
            c = x.nextInt();
            if(a>0)
            {
                if(b>0)
                {
                    if(c>0)
                    {
                        System.out.println(a+"cm부터");
                        System.out.println(b+"cm 까지");
                        System.out.println(c+"cm 단위");
                        System.out.println("신장 표준 체중");
                        System.out.println("===================");
                        for(int i = a; i<=b ; i++)
                        {
                            if(i%c==0)
                            {
                                System.out.print(i+c+" ");
                                System.out.println(((i+c)-100)*0.9);  
                            }
                        }
                        check = 1;

                    }
                }

            }
            else
            {
                System.out.println("양수 값을 입력해야합니다.다시 입력하세요");
            }
            
        }
        x.close();
        
    }
    
}
