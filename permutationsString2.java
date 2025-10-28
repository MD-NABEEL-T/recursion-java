public class PermutationsString2{
    public static void Permutation(String str,String permutes){
        if(str.length()==0){
            System.out.println(permutes);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            Permutation(newStr,permutes+currChar);
        }
    }
    public static void main(String[] args){
        String str="abc";
        Permutation(str,"");
    }
}