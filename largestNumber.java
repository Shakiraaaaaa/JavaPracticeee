import java.util.*;
public class largestNumber {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int numberOne=scanner.nextInt();
        int numberTwo=scanner.nextInt();
        int numberThree=scanner.nextInt();
        if(numberOne>numberTwo && numberOne>numberThree)
        {
            System.out.println("number 1 is greatest");
        }
        else if(numberTwo>numberOne && numberTwo>numberThree)
        {
            System.out.println("number two is greatest");
        }
        else if(numberThree>numberOne && numberThree>numberTwo)
        {
            System.out.println("number three is greatest");
        }
        else
        {
            System.out.println("nothing");
        }
    }
}
