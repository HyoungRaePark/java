import java.util.Scanner;

public class Q_javaf13 
{
    public static void main(String[] args) 
    {
        Scanner x= new Scanner(System.in);
        int a = 0;
        int b = 0;
        int check = 0;
        int check1 = 0;

        do
        {
            System.out.println("계절을 찾습니다");
            System.out.println("몇 월 입니까?");
            a = x.nextInt();
            if(a<=0)
            {
                System.out.println("올바른  값이 아닙니다. 다시 입력하세요.");
                check = 0;
            }
            else if(a>12)
            {
                System.out.println("올바른  값이 아닙니다. 다시 입력하세요.");
                check = 0;
            }
            else
            {
                if(a<=3)
                {
                    System.out.println("겨울 입니다");
                }
                else if (a<=5)
                {
                    System.out.println("봄 입니다");
                }
                else if (a<=9)
                {
                    System.out.println("여름 입니다");
                }
                else if (a<=11)
                {
                    System.out.println("가을 입니다");
                }
                else if (a==12)
                {
                    System.out.println("겨울 입니다");
                }

                do
                {
                    System.out.println("다시 입력하시겠습니까? Yes_1 / No_2 ");
                    b = x.nextInt();
                    if(b==1)
                    {
                        check1 = 0;
                        check = 0;
                    }
                    else if(b==2)
                    {
                        check = 1;
                    }
                    else
                    {
                        System.out.println("올바른  값이 아닙니다. 다시 입력하세요.");
                        check1 = 1;
                    }
                }
                while(check1==1);
            }
        }
        while(check==0);
        x.close();
    }
    
}
