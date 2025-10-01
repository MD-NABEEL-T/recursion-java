// Here stack height is n
public class xPowern{
    public static int xPowerOfn(int x,int n){
        if(n==0) return 1;
        if(x==0) return 0;

            int xPownm1 = xPowerOfn(x,n-1);
            // 5,4,3,2 returns 1 then backtracking in stack
            int val = x *xPownm1;
            // 2*1 then when the stack goes back it is like 2*2,2*3 then final val is returned 
            return val;        
    }
    public static void main(String []args){
        int x=2;
        int n=5;
        int result = xPowerOfn(x,n);
        System.out.println(result);
    }
}

// workflow
// Call: xPowerOfn(2,5)
//    → waiting for xPowerOfn(2,4)
//        → waiting for xPowerOfn(2,3)
//            → waiting for xPowerOfn(2,2)
//                → waiting for xPowerOfn(2,1)
//                    → waiting for xPowerOfn(2,0)
//                        → returns 1
//                    → val = 2*1 = 2, return 2
//                → val = 2*2 = 4, return 4
//            → val = 2*4 = 8, return 8
//        → val = 2*8 = 16, return 16
//    → val = 2*16 = 32, return 32
