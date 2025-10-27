import java.util.HashSet;
public class uniqueSubsequence{
public static void subsequence(String str,int idx,String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
            System.out.println(newString);
            set.add(newString);
            return;
            }
        }
        char currChar = str.charAt(idx);

        // choose to be
        subsequence(str,idx+1,newString+currChar,set);

        // choose not to be
        subsequence(str,idx+1,newString,set);
    }
    public static void main(String []args){
        String str="aac";
        HashSet<String> set = new HashSet<>();
        // it is used to store unique values
        subsequence(str,0,"",set);
    }
}