import java.util.*;
public class Calculator {
    public static void main(String args[])
{
    Scanner scanner=new Scanner(System.in);
    int numberOne=scanner.nextInt();
    int numberTwo=scanner.nextInt();
    char operator=scanner.next().charAt(0);
    switch(operator)
    {
     case '+': System.out.println(numberOne+numberTwo);
     break;   
     case '-': System.out.println(numberOne-numberTwo);
     break;   
     case '*': System.out.println(numberOne*numberTwo);
     break;   
     case '/': System.out.println(numberOne/numberTwo);
     break;   
     case '%': System.out.println(numberOne%numberTwo);
     break;   
    }
}
}
