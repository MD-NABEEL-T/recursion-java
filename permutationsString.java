public class PermutationsString {

    // swap characters i and j in a string and return the new string
    public static String swap(String str, int i, int j) {
        char[] chars = str.toCharArray(); // temporarily convert to array
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    public static void permute(String str, int idx) {
        if (idx == str.length()) {
            System.out.println(str);
            return;
        }

        for (int i = idx; i < str.length(); i++) {
            str = swap(str, i, idx);      // swap i-th with idx-th
            permute(str, idx + 1);        // recurse for next index
            str = swap(str, i, idx);      // backtrack
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permute(str, 0);
    }
}
