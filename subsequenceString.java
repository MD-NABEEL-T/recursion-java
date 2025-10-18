public class subsequenceString{
    public static void subsequence(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        // choose to be
        subsequence(str,idx+1,newString+currChar);

        // choose not to be
        subsequence(str,idx+1,newString);
    }
    public static void main(String []args){
        String str="abc";
        subsequence(str,0,"");
    }
}

// the time complexity is o(2powern);
// because 2 power 3 is 8 based on the above string