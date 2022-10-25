import java.util.*;
public class ProblemThree {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        float pen=scanner.nextFloat();
        float pencil=scanner.nextFloat();
        float eraser=scanner.nextFloat();
        float total=(pen+pencil+eraser)/3;
        System.out.println(total);
        // float vat=18/100;
        float totalWithVat=total+(total*0.18f);
        System.out.println(totalWithVat);
    }
}
