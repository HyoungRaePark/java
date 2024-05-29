import java.util.Scanner;


public class Q_javaf4A {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int i = 0;
        int z = 0;
        int check = 0;



        for(i=0;i<3;i++)
        {
            System.out.println("카운트 다운 합니다");
            a = x.nextInt();

                if(a>0)
                {
                    System.out.printf("양의 정수값:%d\n",a);
                    break ;
                }
                else
                { 
                    System.out.println("양의 정수값을 입력하세요");
                }
            
                i--;
        }

        while (check == 0) 
        {
            if(a>-1)
            {
                for(z=0;z<=a;z++)
                {
                    System.out.println(a-z);
                    if(a<=0)
                    {
                        check = 1;
                    }
                }
            }
            break;

        }

        System.out.printf("입력한 값이 %d 가 되었습니다.",(a-z));
        x.close();







        
    }
    
}
