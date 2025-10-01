public class fibonacci{
    // usual iteration process
    // public static void fibo(int n){
    //     int a=0;
    //     int b=1;
    //     int c=a+b;
    //     for(int i=0;i<n;i++){
    //         System.out.print(a);
    //         a=b;
    //         b=c;
    //         c=a+b;
    //     }
    // }
    public static void fibo(int a ,int b,int n){
        int c;
        if(n==0)
        {
            return;
        }        
        System.out.print(a);
        c=a+b;
        a=b;
        b=c;
        fibo(a,b,n-1);
    }
    public static void main(String []args){
        fibo(0,1,7);
    }
}