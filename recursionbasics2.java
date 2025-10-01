import java.util.*;
public class recursionbasics2
{
    public static void fun(int n)
    {
        int i=1;
        int sum =0;
        if(i<n-1)
        {
            sum=sum+i;
            i++;
            fun(n-1);
        }
        System.out.println(sum);
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
}