public class removeDuplicates{
    public static boolean map[] =new boolean[26];

    public static void removeDuplicates(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true)//here (map[currChar -'a']) without true is same
        {
            removeDuplicates(str,idx+1,newString);
        }
        else{
            newString +=currChar;
            map[currChar-'a'] = true;
            removeDuplicates(str,idx+1,newString);
        }
    }

    public static void main(String []args){
        String str ="qwertyuiopwe";
        removeDuplicates(str,0,"");
    }
}

// explaination:
// It’s basically doing:ASCII convertion ok

// Convert 'b' → 98
// Convert 'a' → 97
// System.out.println('c' - 'a'); // Output: 2