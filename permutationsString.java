public class PermutationsString {
    // swap characters i and j in a string and return the new string
    public static String swap(String str,int i ,int j){
        char []arr = str.toCharArray();
        char temp=arr[i];
        arr[i] = arr[j];
        arr[j] =  temp;
        return new String(arr);
    }

    public static void permute(String str, int idx) {
        if (idx == str.length()) {
            System.out.println(str);
            return;
        }

        for (int i = idx; i < str.length(); i++) {
            str = swap(str, i, idx);
            permute(str, idx + 1);
            str = swap(str, i, idx);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permute(str, 0);
    }
}
// Convert string to array → char[] chars = str.toCharArray();
// This is because strings are immutable, so we can’t swap directly.
// Swap characters in the array → chars[i] ↔ chars[j]
// Convert array back to string → new String(chars)