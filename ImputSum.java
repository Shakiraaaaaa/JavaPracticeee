import java.util.*;
public class ImputSum {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int i=1;
        int sum=0;
        while(i<=number)
        {
            sum+=i;
            i++;

        }
        System.out.println("sum of total numbers "+sum);
    }
}
