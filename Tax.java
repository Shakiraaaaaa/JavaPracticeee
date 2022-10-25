import java.util.*;

import javax.lang.model.element.Element;
public class Tax {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int income=scanner.nextInt();
        float tax=0;
        if(income<500000)
        {
        tax=0;
        }
        else if(income>500000 && income<1000000)
        {
            tax=(int) income*0.20f;
        }
        else if(income>1000000)
        {
tax=income*0.30f;
        }
        System.out.println(tax);
    }
   
}
