import java.util.*;
public class Area {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        float pie=scanner.nextFloat();
        int radius=scanner.nextInt();
        float area=pie*(radius*radius);
        System.out.println(area);
        
    }
}
