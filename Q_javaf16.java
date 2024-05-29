import java.util.Scanner;

public class Q_javaf16 
{

    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int a = 0;

        System.out.println("입력한 단수만큼 피라미드가 형성되게하세요");

        System.out.print("단수는=>");

        a = x.nextInt();

        for(int i = 0 ; i < a ; i++)
        {
            for(int j = 0; j < a-i ; j++)
            {
                System.out.print(" ");
            } 
            for(int k=0; k<i*2+1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        x.close();
    }
}