import java.util.*;
public class LeapYear {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if(year%4==0 && year%4==400 )
        {
            System.out.println("Leap year");
        }
        else if(year%100==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not leap year");
        }
    }
}
