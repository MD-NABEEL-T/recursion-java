import java.util.*;
public class reverseString{
    public static void reverseStr(int i,String str,int n){
        if(i==n){
            return;
        }
        reverseStr(i+1,str,n);
        System.out.print(str.charAt(i));
    }
    public static void reverseStr2(int i,int String,int n){
        if(i>n){
            return;
        }
        System.out.println(str.charAt(i));
        reverseStr2(i-1,str,n);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        reverseStr(0,str,n);
    }
}