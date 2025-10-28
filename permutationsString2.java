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
        String str="ad";
        Permutation(str,"");
    }
}
// You’d think like this:

// First letter = a
// Remaining letters = "bc"
// → possible endings: bc, cb
// → So: a + bc, a + cb

// Permutation("abc","")
//  ├─ i=0 → Permutation("bc","a")
//  │    ├─ i=0 → Permutation("c","ab") → print abc
//  │    └─ i=1 → Permutation("b","ac") → print acb
//  ├─ i=1 → Permutation("ac","b")
//  │    ├─ i=0 → Permutation("c","ba") → print bac
//  │    └─ i=1 → Permutation("a","bc") → print bca
//  └─ i=2 → Permutation("ab","c")
//       ├─ i=0 → Permutation("b","ca") → print cab
//       └─ i=1 → Permutation("a","cb") → print cba

// | i | remove which | substring(0,i) | substring(i+1) | newStr (combined) |
// | - | ------------ | -------------- | -------------- | ----------------- |
// | 0 | 'a'          | ""             | "bc"           | "bc"              |
// | 1 | 'b'          | "a"            | "c"            | "ac"              |
// | 2 | 'c'          | "ab"           | ""             | "ab"              |
