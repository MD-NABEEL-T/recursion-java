public class xPowernLog{
    public static int xPowerOfn(int x,int n){
        if(n==0) return 1;
        if(x==0) return 0;
        // if n is odd;
        if(n%2 == 0) return xPowerOfn(x,n/2)* xPowerOfn(x,n/2);
        // if n is even 
        else return xPowerOfn(x,n/2)* xPowerOfn(x,n/2) *x;

    }
    public static void main(String []args){
        int x=2;
        int n=5;
        int result = xPowerOfn(x,n);
        System.out.println(result);
    }
}
