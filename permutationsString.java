public class permutationsString{
    public static void swap(String str,int i,int j){
        char temp=str.charAt(i);
        str.charAt(i)=str.charAt(j);
        str.charAt(j)=temp;
    }
    public static void permute(String str,int idx){
        if(idx==str.length){
            System.out.println(currChar);
            return;
        }
        char currChar=str.charAt(idx);
        for(int i=idx;i<nums.length;i++){
            swap(str,i,idx);
            permute(str,idx);
            swap(str,i,idx);//backtracking
        }
    }

    public static void main(String []args){
        String str="abc";
        permute(str,0);
    }
}