import java.util.*;
public class recursionbasics
{
    public static void recursiveFunc(int n)
    {
        if(n>=0)
        {
        System.out.println(n);
        recursiveFunc(n -1);            
        }
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursiveFunc(n);
    }
}
