import java.util.Scanner;

public class Q_javaf17 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;
        
        
        System.out.println("입력한 단수만큼 피라미드가 형성되게하세요");

        System.out.print("단수는=>");

        a = x.nextInt();

        for(int i = 1 ; i < a ; i++)
        {
            for(int j = 0; j < a-i ; j++)
            {
                System.out.print(" ");
            } 
            for(int k=2; k<i*2+1; k++)
            {
                if(i<10)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(i%10);
                }
            }
            System.out.println();
        }
        x.close();
    }
    
}
